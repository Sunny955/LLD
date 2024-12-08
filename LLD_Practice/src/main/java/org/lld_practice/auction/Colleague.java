package org.lld_practice.auction;

public interface Colleague {
    void placeBid(int bidAmount);

    void receiveBidNotification(int bidAmount);

    String getName();
}