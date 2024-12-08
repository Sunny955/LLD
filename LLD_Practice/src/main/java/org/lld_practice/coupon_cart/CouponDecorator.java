package org.lld_practice.coupon_cart;

public abstract class CouponDecorator extends Product {
    protected Product product;

    public CouponDecorator(Product p) {
        this.product = p;
    }
}
