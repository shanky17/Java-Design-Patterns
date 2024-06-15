package main.structuralPatterns.decorator;

public class MushroomDecorator extends ToppingDecorator {
    BasePizza basePizza;

    public MushroomDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    int cost() {
        return basePizza.cost() + 50;
    }
}
