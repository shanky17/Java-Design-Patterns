package main.structuralPatterns.bridge;

public class Radio implements Device {
    @Override
    public void turnOn() {
        System.out.println("Turning ON Radio");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning OFF Radio");
    }
}
