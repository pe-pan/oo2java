package com.hp.demo.oo;

import com.hp.demo.oo.beans10.FlowType;
import com.hp.demo.oo.beans10.OperationType;
import com.hp.demo.oo.entity.Flow;
import com.hp.demo.oo.entity.Operation;
import com.hp.demo.oo.graph.Step;
import com.hp.demo.oo.graph.Transition;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by panuska on 28.7.14.
 */
public class Repository {
    private static Logger log = Logger.getLogger(Repository.class.getName());
    File rootFolder;
    File outputFolder;
    private static Map<String, File> files = new HashMap<>();
    private static Map<String, FlowType> flowBeans = new HashMap<>();
    private static Map<String, OperationType> operationBeans = new HashMap<>();
    private static Map<String, Flow> flows = new HashMap<>();
    private static Map<String, Flow> unknownFlows = new HashMap<>();
    private static Map<String, Operation> operations = new HashMap<>();
    private static Map<String, Step> transitions = new HashMap<>();

    private static Repository repository;

    public Repository(File rootFolder, File outputFolder) {
        this.rootFolder = rootFolder;
        this.outputFolder = outputFolder;
        Repository.repository = this;
    }

    public static Repository getRepository() {
        if (repository == null) {
            throw new IllegalStateException("Repository not initialized yet!");
        }
        return repository;
    }

    /**
     * Unmarshals XML files containing OO flows from input folder into java beans.
     * @throws IOException
     * @throws JAXBException
     */
    public void load() throws IOException, JAXBException, ParserConfigurationException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        final DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        Files.walkFileTree(rootFolder.toPath(), new FileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                try {
                    log.info("Loading "+file.toFile());
                    Document doc = docBuilder.parse(file.toFile());
                    String rootElement = doc.getDocumentElement().getTagName();
                    if ("flow".equals(rootElement)) {
                        JAXBContext context = JAXBContext.newInstance(FlowType.class);
                        final Unmarshaller unmarshaller = context.createUnmarshaller();

                        JAXBElement<FlowType> xml = unmarshaller.unmarshal(new StreamSource(file.toFile()), FlowType.class);
                        FlowType flow = xml.getValue();
                        flowBeans.put(flow.getId(), flow);
                        files.put(flow.getId(), file.toFile());
                    } else if ("operation".equals(rootElement)) {
                        JAXBContext context = JAXBContext.newInstance(OperationType.class);
                        final Unmarshaller unmarshaller = context.createUnmarshaller();

                        JAXBElement<OperationType> xml = unmarshaller.unmarshal(new StreamSource(file.toFile()), OperationType.class);
                        OperationType operation = xml.getValue();
                        operationBeans.put(operation.getId(), operation);
                        files.put(operation.getId(), file.toFile());
                    }
                } catch (JAXBException | SAXException e) {
                    throw new IllegalStateException(e);
                }
                log.debug("Reading "+file.toFile().getAbsolutePath());
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                return FileVisitResult.CONTINUE;
            }
        });

    }

    /**
     * Creates a more suitable java representation from java beans.
     */
    public void init() {
        int prefixLength = rootFolder.getAbsolutePath().length();

        Set<String> beanIds = flowBeans.keySet();
        for (String beanId : beanIds) {
            FlowType bean = flowBeans.get(beanId);
            File file = files.get(beanId);
            String pakage = getPackage(file, prefixLength);
            Flow flow = new Flow(bean, pakage);
            log.info("Initializing "+file);
            flows.put(beanId, flow);
        }

        //todo code duplicate
        beanIds = operationBeans.keySet();
        for (String beanId : beanIds) {
            OperationType bean = operationBeans.get(beanId);
            File file = files.get(beanId);
            String pakage = getPackage(file, prefixLength);
            Operation operation = new Operation(bean, pakage);
            log.info("Initializing "+file);
            operations.put(beanId, operation);
        }

    }

    private String getPackage(File file, int prefixLength) {
        String suffix = file.getAbsolutePath().substring(prefixLength);
        suffix = suffix.substring(0, suffix.length()-file.getName().length()-1);
//        suffix = suffix.substring(0, suffix.length()-".xml".length());
        suffix = suffix.replace(File.separator, ".");
        suffix = suffix.replace(" ", "_");
        if (suffix.length()> 0 && suffix.charAt(0) == '.') {
            suffix = suffix.substring(1);
        }
        return suffix;
    }

    /**
     * Writes down the java representation of original OO flow.
     * @throws IOException
     */
    public void transform() throws IOException {
        int error = 0;
        for (Flow flow : flows.values()) {
            if (flow.getName().equals("HPC-v13 Rebuild Server")) continue;
            log.info("Transforming "+flow.getName());
            BufferedWriter file = null;
            try {
                String javaFolder = outputFolder.getAbsolutePath()+File.separator+flow.getPackage().replace('.',File.separatorChar);
                File javaFolderFile = new File(javaFolder);
                javaFolderFile.mkdirs();

                File javaFile = new File(javaFolderFile, flow.getName().replace(" ", "_")+".java");
                file = new BufferedWriter(new FileWriter(javaFile));

                file.write("package "+flow.getPackage()+";\n\n");
                file.write("/**\n");
                file.write(flow.getAnnotation());
                file.write("\n*/\n");
                file.write("public class " + flow.getName().replace(" ", "_") + " {\n");
                file.write("    public void run() {\n");
                int cycles = 2;
                flow.transform(file, cycles, flow.getStartBlock(), null, null);
//                flow.getStartBlock().transform(file, cycles);

//                Step step = flow.getStartStep();
//                List<Step> nextSteps = new LinkedList<>();
//                while (step != null) {
//                    Step cycleEnd = step.isCycleStart();
//                    if (cycleEnd != null)  {
//                        nextSteps.addAll(writeCycle(file, cycles, step));
//                    } else {
//                        if (step.)
//                        align(file, cycles);
//                        file.write("        "+step+"\n");
//                        step = step.
//                    }
//                    if (nextSteps.size() > 0) {
//                        step = nextSteps.remove(0);
//                    } else {
//                        step = null;
//                    }
//                }
//
//
//
//                for (Step step : flow.getSteps()) {  // should be ordered and pre-processed by now
//                    Step cycleEnd = step.isCycleStart();
//                    if (cycleEnd != null)  {
//                        file.write("        l"+step.getOrder()+":  // cycle start ("+cycleEnd.getName()+")\n");
//                        cycles++;
//                    }
//                    for (int i = 0; i < cycles; i++) {
//                        file.write("    ");
//                    }
//                    file.write("        "+step+"\n");
//                    Step cycleStart = step.isCycleEnd();
//                    if (cycleStart != null) {
//                        file.write("        goto l"+cycleStart.getOrder()+"; // cycle end ("+cycleStart.getName()+")\n");
//                        cycles--;
//                    }
//                }



//                Step step = flow.getStartStep();
//                while (step != null) {
//                    file.write("        "+step+"\n");
//                    List<Transition> transitions = step.getTransitions();
//                    step = transitions == null || transitions.size() == 0 ? null : transitions.get(0).getDestination();  //todo all transitions!
//                }
                file.write("    }\n");
                file.write("}\n");
            } catch (Throwable e) {
                error++;
                log.error(e, e);
            } finally {
                if (file != null) file.close();
            }
        }

        //todo save also operations!
        log.info("Transformed "+(flows.size()-error)+" flows; "+error+" were not transformed as they failed");
    }

//    private static List<Step> writeCycle(BufferedWriter file, int cycles, Step step) throws IOException {
//        List<Step> exitLoopSteps = new LinkedList<>();
//        while (step != null) {
//            align(file, cycles);
//            Step cycleEnd = step.isCycleStart();
//            file.write("        for(;;) { //"+cycleEnd.getName()+"\n");
//            cycles++;
//            align(file, cycles);
//            file.write(step.transform());
//            Step cycleStart = step.isCycleEnd();
//            if (cycleStart != null) {      //todo from loop final step, there cannot be exit steps?
//                cycles--;
//                align(file, cycles);
//                file.write("        } //"+cycleStart.getName()+"\n");
//                return exitLoopSteps;
//            }
//            exitLoopSteps.addAll(step.getLoopExitSteps());
//            step = step.getNextStepInTheLoop();
//        }
//        if (exitLoopSteps.size() > 1) {
//            log.error("There is more steps exiting the loop! "+exitLoopSteps);
//        }
//        return exitLoopSteps;
//    }

    public static void align(BufferedWriter file, int cycles) throws IOException {
        for (int i = 0; i < cycles; i++) {
            file.write("    ");
        }
    }

    public Flow getFlow(String uuid) {
        Flow flow = flows.get(uuid);
        if (flow == null) {
            flow = unknownFlows.get(uuid);
            if (flow == null) {
                flow = new Flow(uuid);
                unknownFlows.put(uuid, flow);
            }

//            throw new IllegalStateException("Flow not found: "+uuid);
        }
        return flow;
    }

    public Operation getOperation(String uuid) {
        return operations.get(uuid);
    }

    public void addTransition(Step transition) {
        transitions.put(transition.getUuid(), transition);
    }
    public Step getTransition(String uuid) {
        return transitions.get(uuid);
    }

}
