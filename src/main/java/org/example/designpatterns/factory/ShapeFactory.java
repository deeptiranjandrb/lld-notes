package org.example.designpatterns.factory;

public class ShapeFactory {
    public Shape getShape(String input){
        return switch (input) {
            case "CIRCLE" -> new Circle();
            case "LINE" -> new Line();
            default -> null;
        };
    }
}
