package main.behavioralPatterns.state;

public class ProductSelectedState implements VendingMachineState {
    @Override
    public void handleRequest() {
        System.out.println("Product selected state: Continue for payment");
    }
}
