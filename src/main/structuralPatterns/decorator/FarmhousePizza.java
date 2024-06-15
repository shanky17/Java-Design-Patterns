package main.structuralPatterns.decorator;

public class FarmhousePizza extends BasePizza {
    @Override
    int cost() {
        return 200;
    }
}
