package main.creationalPatterns.abstractFactory;

public class LuxuryCarFactory implements CarFactory {

    @Override
    public Car getCarInstance(int price) {
        if (price <= 5000000)
            return new LuxuryCar1();
        else
            return new LuxuryCar2();
    }
}
