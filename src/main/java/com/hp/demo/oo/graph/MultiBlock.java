package com.hp.demo.oo.graph;

import com.hp.demo.oo.Repository;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by panuska on 8.8.14.
 */
public class MultiBlock extends Block {

    List<Block> blocks;

    private String uuid;

    public MultiBlock(List<Block> blocks) {
        this.blocks = blocks;
        uuid = "";
        for (Block block : blocks) {
            uuid = uuid + block.getUuid();
        }
        Block.blockRepository.put(uuid, this);
//        firstStep = blocks.get(0).firstStep;   //todo a bit hack
        numberOfInputs = 0;
    }

    public void increaseNumberOfInputs() {
        numberOfInputs++;
    }

    public String getUuid() {
        return uuid;
    }

    public boolean transform(BufferedWriter file, int cycles) throws IOException {
        if (blocks.size() == 2) {
            Repository.align(file, cycles);
            file.write("if (condition) {\n");
            blocks.get(0).transform(file, cycles + 1);
            Repository.align(file, cycles);
            file.write("} else {\n");
            blocks.get(1).transform(file, cycles + 1);
            Repository.align(file, cycles);
            file.write("}\n");
        } else {
            Repository.align(file, cycles);
            file.write("switch (condition) {\n");
            for (Block block : blocks) {
                Repository.align(file, cycles+1);
                file.write("case 1:\n");
                Repository.align(file, cycles+2);
                block.transform(file, cycles+2);
                Repository.align(file, cycles+2);
                file.write("break;\n");
            }
        }
        if (nextBlock != null) {
            nextBlock.transform(file, cycles);
        }
        return true;
    }

    public String toString() {
        return "MBlock "+blocks.size();
    }
}
