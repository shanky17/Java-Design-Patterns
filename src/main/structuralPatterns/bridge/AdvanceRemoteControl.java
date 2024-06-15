package main.structuralPatterns.bridge;

public class AdvanceRemoteControl extends RemoteControl {
    AdvanceRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        System.out.println("Using advanced remote to toggle power with new features");
        this.device.turnOff();
    }
}
