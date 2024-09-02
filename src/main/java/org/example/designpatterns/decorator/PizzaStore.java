package org.example.designpatterns.decorator;

public class PizzaStore {
    public static void main(String[] args) {
        // create a new nonveg pizza;
        BasePizza pizza = new NonvegPizza();

        //add mushroom
        pizza = new MushroomToppings(pizza);
        //add jalepinos
        pizza = new JalepinoTopping(pizza);

        System.out.println("Pizza cost: " + pizza.cost());
    }
}
