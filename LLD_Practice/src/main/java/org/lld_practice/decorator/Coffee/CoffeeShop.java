package org.lld_practice.decorator.Coffee;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();

        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getCost());
    }
}
