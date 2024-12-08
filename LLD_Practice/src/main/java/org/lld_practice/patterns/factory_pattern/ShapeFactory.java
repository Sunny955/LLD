package org.lld_practice.patterns.factory_pattern;

public class ShapeFactory {
    Shape getShape(String input) {
        return switch (input) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
