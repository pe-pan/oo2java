package com.hp.demo.oo;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by panuska on 28.7.14.
 */
public class Oo2Java {
    private static Logger log = Logger.getLogger(Oo2Java.class.getName());
    public static void main(String[] args) throws IOException, JAXBException, ParserConfigurationException {
        if (args.length < 2) {
            System.out.println("Usage: input_folder output_folder");
            System.out.println("  Output folder will be cleaned first!!");
            System.exit(-1);
        }

        File inputFolder = new File(args[0]);
//        inputFolder.mkdirs();

        File outputFolder = new File(args[1]);
        log.debug("Creating output folder "+outputFolder.getAbsolutePath());
        outputFolder.mkdirs();

        log.debug("Cleaning output folder " + outputFolder.getAbsolutePath());
        FileUtils.cleanDirectory(outputFolder);

        Repository beansRepository = new Repository(inputFolder, outputFolder);
        beansRepository.load();
        beansRepository.init();
        beansRepository.transform();


    }
}
