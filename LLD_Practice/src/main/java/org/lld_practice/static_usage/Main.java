package org.lld_practice.static_usage;

class Counter {
    private static int counter;

    public Counter() {
        counter = 0;
    }

    public void increase() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}

class Product {
    private String name;

    private Product(String name) {
        this.name = name;
    }

    public static Product createProduct(String name) {
        return new Product(name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.increase();
        Counter c2 = new Counter();
        c2.increase();
        System.out.println(Counter.getCounter());

        Product p = Product.createProduct("Thulla");
        System.out.println(p);
    }
}
