package main.structuralPatterns.bridge;

public class BasicRemoteControl extends RemoteControl {
    BasicRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        System.out.println("Using basic remote to toggle power");
        this.device.turnOn();
    }
}
