package main.behavioralPatterns.visitor;

public class RoomPricingVisitor implements Visitor {
    @Override
    public void visit(Room room) {
        if (room instanceof SingleRoom singleRoom) {
            singleRoom.roomPrice = 1000;
            System.out.println("Computing Single room price: " + singleRoom.roomPrice);
        }
        else if (room instanceof DoubleRoom doubleRoom) {
            doubleRoom.roomPrice = 2500;
            System.out.println("Computing Double room price: " + doubleRoom.roomPrice);
        }
        else if (room instanceof DeluxeRoom deluxeRoom) {
            deluxeRoom.roomPrice = 4500;
            System.out.println("Computing Deluxe room price: " + deluxeRoom.roomPrice);
        }
    }
}
