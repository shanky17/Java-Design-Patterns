package main.creationalPatterns.factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeInstance = new ShapeFactory();
        Shape circle = shapeInstance.getShapeInstance("circle");
        circle.getArea();

        Shape square = shapeInstance.getShapeInstance("square");
        square.getArea();
    }
}