package main.creationalPatterns.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();

        CarFactory economicCarFactory = abstractFactoryProducer.getCarFactoryInstance("economic");
        Car eCar1 = economicCarFactory.getCarInstance(250000);
        System.out.println("Top car speed is: " + eCar1.getTopSpeed());

        Car eCar2 = economicCarFactory.getCarInstance(500000);
        System.out.println("Top car speed is: " + eCar2.getTopSpeed());

        CarFactory luxuryCarFactory = abstractFactoryProducer.getCarFactoryInstance("luxury");
        Car lCar1 = luxuryCarFactory.getCarInstance(4000000);
        System.out.println("Top Car speed is: " + lCar1.getTopSpeed());

        Car lCar2 = luxuryCarFactory.getCarInstance(7500000);
        System.out.println("Top Car speed is: " + lCar2.getTopSpeed());
    }
}

class AbstractFactoryProducer {
    public CarFactory getCarFactoryInstance(String carType) {
        if (carType.equals("economic"))
            return new EconomicCarFactory();
        if (carType.equals("luxury"))
            return new LuxuryCarFactory();

        return null;
    }
}
