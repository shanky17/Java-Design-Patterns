package main.behavioralPatterns.state;

public class ReadyState implements VendingMachineState {
    @Override
    public void handleRequest() {
        System.out.println("Ready state: Select a product");
    }
}
