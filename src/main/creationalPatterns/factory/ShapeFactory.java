package main.creationalPatterns.factory;

public class ShapeFactory {
    public Shape getShapeInstance(String value) {
        if (value.equals("circle")) {
            return new Circle();
        } else if (value.equals("square")) {
            return new Square();
        }
        return null;
    }
}
