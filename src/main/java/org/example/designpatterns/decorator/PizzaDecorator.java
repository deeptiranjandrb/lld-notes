package org.example.designpatterns.decorator;

public abstract class PizzaDecorator extends BasePizza{
    BasePizza pizza;

    public PizzaDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }
}
