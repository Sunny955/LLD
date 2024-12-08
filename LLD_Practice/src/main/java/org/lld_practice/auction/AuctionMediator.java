package org.lld_practice.auction;

public interface AuctionMediator {
    void addBidder(Colleague bidder);

    void placeBid(Colleague bidder, int bidAmount);
}
