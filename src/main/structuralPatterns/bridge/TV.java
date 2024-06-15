package main.structuralPatterns.bridge;

public class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Turning ON TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning OFF TV");
    }
}
