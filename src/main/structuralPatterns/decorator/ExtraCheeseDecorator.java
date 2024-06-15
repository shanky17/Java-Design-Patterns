package main.structuralPatterns.decorator;

public class ExtraCheeseDecorator extends ToppingDecorator {
    BasePizza basePizza;

    public ExtraCheeseDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    int cost() {
        return basePizza.cost() + 100;
    }
}
