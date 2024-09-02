package org.example.designpatterns.factory;

public class Runner {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        factory.getShape("CIRCLE").draw();
    }
}
