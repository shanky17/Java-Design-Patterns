package main.behavioralPatterns.command;

public class RemoteControl {
    Command command;

    RemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
