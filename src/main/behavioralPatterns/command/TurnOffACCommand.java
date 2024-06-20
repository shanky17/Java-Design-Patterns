package main.behavioralPatterns.command;

public class TurnOffACCommand implements Command {
    private final AirConditioner airConditioner;

    TurnOffACCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOffAC();
    }
}
