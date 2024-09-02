package org.example.designpatterns.decorator;

public class MushroomToppings extends PizzaDecorator{
    public MushroomToppings(BasePizza pizza){
        super(pizza);
    }
    @Override
    public Integer cost() {
        return this.pizza.cost() + 20;
    }
}
