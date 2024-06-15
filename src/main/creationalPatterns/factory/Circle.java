package main.creationalPatterns.factory;

public class Circle implements Shape {

    @Override
    public void getArea() {
        System.out.println("Compute Circle area");
    }
}
