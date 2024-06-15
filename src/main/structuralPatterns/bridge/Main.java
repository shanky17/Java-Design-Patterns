package main.structuralPatterns.bridge;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Radio radio = new Radio();

        BasicRemoteControl basicRemoteControl = new BasicRemoteControl(tv);
        basicRemoteControl.togglePower();

        AdvanceRemoteControl advanceRemoteControl = new AdvanceRemoteControl(radio);
        advanceRemoteControl.togglePower();
    }
}
