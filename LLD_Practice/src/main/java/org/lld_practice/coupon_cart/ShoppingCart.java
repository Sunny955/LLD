package org.lld_practice.coupon_cart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addToCart(Product p) {
        Product newProduct = new PercentageCoupon(p, 12);
        // Then apply a type-based coupon
        Product now = new TypeCoupon(newProduct, 6);

        // Add the decorated product to the cart
        products.add(now);
    }

    public Double getTotalPrice() {
        Double totalPrice = 0.0;
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }
}
