package main.behavioralPatterns.state;

public class PaymentProcessingState implements VendingMachineState {
    @Override
    public void handleRequest() {
        System.out.println("Payment processing state: Please wait for payment to complete");
    }
}
