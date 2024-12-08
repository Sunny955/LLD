package org.lld_practice.coupon_cart;

public class Item1 extends Product {

    public Item1(String name, Double orgPrice, ProductType type) {
        super(name, orgPrice, type);
    }

    @Override
    Double getPrice() {
        return this.originalPrice;
    }

}
