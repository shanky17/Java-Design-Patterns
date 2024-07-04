package main.behavioralPatterns.visitor;

public class Main {
    public static void main(String[] args) {
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room deluxeRoom = new DeluxeRoom();

        Visitor visitor = new RoomPricingVisitor();

        singleRoom.accept(visitor);
        doubleRoom.accept(visitor);
        deluxeRoom.accept(visitor);
    }
}
