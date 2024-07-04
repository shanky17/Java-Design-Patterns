package main.behavioralPatterns.visitor;

public class DeluxeRoom implements Room {
    int roomPrice = 0;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
