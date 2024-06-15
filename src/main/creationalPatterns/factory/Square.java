package main.creationalPatterns.factory;

public class Square implements Shape {

    @Override
    public void getArea() {
        System.out.println("Compute Square area");
    }
}
