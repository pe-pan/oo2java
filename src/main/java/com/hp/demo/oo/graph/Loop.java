package com.hp.demo.oo.graph;

import com.hp.demo.oo.Repository;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by panuska on 13.8.14.
 */
public class Loop extends Block {

    private Block root;

    public Loop(Block root, List<Block> nextBlocks) {
        this.root = root;
        if (nextBlocks.size() == 1) {
            this.nextBlock = nextBlocks.iterator().next();
            this.nextBlock.reverseBlocks.add(this);
        } else if (nextBlocks.size() > 1) {
            this.nextBlocks = nextBlocks;
            for (Block nextBlock : nextBlocks) {
                if (nextBlock != null)
                nextBlock.reverseBlocks.add(this);
            }
        }
    }

    public boolean transform(BufferedWriter file, int cycles) throws IOException {
        Repository.align(file, cycles);
        file.write("for(;;) {\n");
        cycles++;
//        root.transform(file, cycles);

        Block block = root;
        do {
            block.transform(file, cycles, block.exitsLoop);
//            if (block.exitsLoop) {
//                Repository.align(file, cycles);
//                file.write("if (returnValue) break;\n");
//            }
            block = block.nextBlock;
            if (block == null) {
                block = root;
            }
        } while (block != root);
        cycles--;
        Repository.align(file, cycles);
        file.write("}\n");
        if (nextBlock != null) {
            nextBlock.transform(file, cycles, nextBlock.exitsLoop);
        } else if (nextBlocks != null) {
            for (Block nextBlock: nextBlocks) {
                if (nextBlock != null) // nextBlock might be null as we broke the loop!
                nextBlock.transform(file, cycles, nextBlock.exitsLoop);
            }
        }

//        if (loopStart) {
////            if (lastStepIsCondition) {
////                for (Block nextBlock : nextBlocks) {
////                    nextBlock.transform(file, cycles);
////                }
////            } else {
////                nextBlock.transform(file, cycles);
////            }
//        }

//        if (exitsLoop) {
//            Repository.align(file, cycles);
//            file.write("if (returnValue) break;\n");
//        }
//        if (loopEnd) {
//            cycles--;
//            Repository.align(file, cycles);
//            file.write("}\n");
//        }
        return true;
    }

    public String toString() {
        return "loop - "+root.toString();
    }


}
