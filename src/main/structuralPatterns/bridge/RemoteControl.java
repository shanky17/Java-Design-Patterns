package main.structuralPatterns.bridge;

public abstract class RemoteControl {
    Device device;

    RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void togglePower();
}
