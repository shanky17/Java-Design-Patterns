package main.structuralPatterns.adapter;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    WeightMachine machine;

    WeightMachineAdapterImpl(WeightMachine machine) {
        this.machine = machine;
    }

    @Override
    public double getWeightInKg() {
        int weightInPounds = machine.getWeightInPounds();
        return weightInPounds * 0.45;
    }
}
