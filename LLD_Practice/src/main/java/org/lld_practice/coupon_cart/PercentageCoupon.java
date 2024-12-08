package org.lld_practice.coupon_cart;

public class PercentageCoupon extends CouponDecorator {
    int discountPercent;

    public PercentageCoupon(Product p, int percentage) {
        super(p);
        this.discountPercent = percentage;
    }

    @Override
    Double getPrice() {
        Double price = this.product.getPrice();

        if (price == null) {
            throw new NullPointerException("Price cannot be null in PercentageCoupon");
        }

        return price - (price * discountPercent) / 100;
    }

}
