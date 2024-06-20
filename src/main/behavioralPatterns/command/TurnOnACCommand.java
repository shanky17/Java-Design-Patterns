package main.behavioralPatterns.command;

public class TurnOnACCommand implements Command {
    private final AirConditioner airConditioner;

    TurnOnACCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOnAC();
    }
}
