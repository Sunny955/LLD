package org.lld_practice.patterns.factory_pattern;

public class MainClass {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape Circleshape = factory.getShape("CIRCLE");
        Circleshape.draw();

        Shape Rectangle = factory.getShape("RECTANGLE");
        Rectangle.draw();
    }
}
