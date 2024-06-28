package main.behavioralPatterns.mediator;

public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();

        Colleague bidder1 = new Bidder("Johnson", auctionMediator);
        Colleague bidder2 = new Bidder("Rakuten", auctionMediator);

        bidder1.placeBid(53000);
        bidder2.placeBid(60000);
    }
}
