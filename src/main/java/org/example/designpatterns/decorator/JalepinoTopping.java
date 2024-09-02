package org.example.designpatterns.decorator;

public class JalepinoTopping extends PizzaDecorator{
    public JalepinoTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public Integer cost() {
        return pizza.cost() + 30;
    }
}
