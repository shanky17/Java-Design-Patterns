package main.structuralPatterns.adapter;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineImpl());
        double weightInKg = weightMachineAdapter.getWeightInKg();
        System.out.println(weightInKg);
    }
}
