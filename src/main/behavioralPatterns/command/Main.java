package main.behavioralPatterns.command;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();

        Command turnOnCommand = new TurnOnACCommand(airConditioner);
        Command turnOffCommand = new TurnOffACCommand(airConditioner);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();
    }
}
