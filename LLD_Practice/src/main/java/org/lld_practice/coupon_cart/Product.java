package org.lld_practice.coupon_cart;

public abstract class Product {
    String name;
    Double originalPrice;
    ProductType type;

    Product() {

    }

    public Product(String name, Double originalPrice, ProductType type) {
        this.name = name;
        this.originalPrice = originalPrice;
        this.type = type;
    }

    abstract Double getPrice();

    public ProductType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", originalPrice=" + originalPrice + ", type=" + type + "]";
    }
}
