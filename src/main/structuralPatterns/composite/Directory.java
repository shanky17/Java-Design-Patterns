package main.structuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    List<FileSystem> fileSystemList = new ArrayList<>();

    void add(FileSystem fs) {
        fileSystemList.add(fs);
    }

    @Override
    public void ls() {
        for (FileSystem file : fileSystemList) {
            file.ls();
        }
    }
}
