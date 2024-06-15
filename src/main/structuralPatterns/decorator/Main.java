package main.structuralPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new MushroomDecorator(new ExtraCheeseDecorator(new FarmhousePizza()));
        System.out.println("Total cost: " + pizza.cost());
    }
}
