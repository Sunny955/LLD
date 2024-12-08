package org.lld_practice.auction;

public class Main {
    public static void main(String[] args) {
        AuctionMediator mediator = new Auction();

        Colleague bidder1 = new Bidder("Dalla", mediator);
        Colleague bidder2 = new Bidder("Chuchu", mediator);

        bidder1.placeBid(12);
        bidder2.placeBid(40);
    }
}
