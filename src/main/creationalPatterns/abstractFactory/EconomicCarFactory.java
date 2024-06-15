package main.creationalPatterns.abstractFactory;

public class EconomicCarFactory implements CarFactory {

    @Override
    public Car getCarInstance(int price) {
        if (price <= 300000)
            return new EconomicCar1();
        else
            return new EconomicCar2();
    }
}
