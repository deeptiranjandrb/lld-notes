package org.example.designpatterns.strategy.without;

public class OffRoadVehicle extends Vehicle{
    @Override
    public void drive(){

        //duplicate code(same as GoodsVehicle)
        System.out.println("drive in rugged road");
    }
}
