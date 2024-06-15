package main.structuralPatterns.composite;

public class File implements FileSystem {
    String fileName;

    File(String name) {
        fileName = name;
    }

    @Override
    public void ls() {
        System.out.println("File name: " + fileName);
    }
}
