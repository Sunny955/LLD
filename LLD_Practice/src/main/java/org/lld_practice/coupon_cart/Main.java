package org.lld_practice.coupon_cart;

public class Main {
    public static void main(String[] args) {
        Product item1 = new Item1("Fan", 19.2, ProductType.ELECTRONICS);
        Product item2 = new Item2("Table", 209.3, ProductType.FURNITURE);

        System.out.println("Item1 original price: " + item1.getOriginalPrice());
        System.out.println("Item2 original price: " + item2.getOriginalPrice());

        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(item1);
        cart.addToCart(item2);

        System.out.println("Total cart price: " + cart.getTotalPrice());
    }
}
