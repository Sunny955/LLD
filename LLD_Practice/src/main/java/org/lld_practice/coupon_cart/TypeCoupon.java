package org.lld_practice.coupon_cart;

import java.util.ArrayList;
import java.util.List;

public class TypeCoupon extends CouponDecorator {

    int discountPercent;
    ProductType type;

    private static List<ProductType> types = new ArrayList<>();

    static {
        types.add(ProductType.ELECTRONICS);
        types.add(ProductType.LAPTOPS);
    }

    public TypeCoupon(Product p, int percent) {
        super(p);
        this.discountPercent = percent;
        this.type = p.getType();
    }

    @Override
    Double getPrice() {
        Double price = this.product.getPrice();

        if (types.contains(this.type)) {
            return price - (price * discountPercent) / 100;
        }
        return price;
    }

}
