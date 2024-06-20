package main.behavioralPatterns.command;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOnAC() {
        isOn = true;
        System.out.println("AC is now ON");
    }

    public void turnOffAC() {
        isOn = false;
        System.out.println("AC is now OFF");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to: " + temperature);
    }
}
