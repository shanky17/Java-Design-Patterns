package main.structuralPatterns.composite;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory();
        Directory nestedDirectory = new Directory();

        FileSystem file1 = new File("logs.txt");
        FileSystem file2 = new File("404.exe");

        nestedDirectory.add(file2);

        directory.add(file1);
        directory.add(nestedDirectory);

        directory.ls();
    }
}
