package org.example.designpatterns.strategy.with;

import org.example.designpatterns.strategy.with.strategy.DrivingStrategy;

public class Vehicle {
    DrivingStrategy drivingStrategy;
    public Vehicle(DrivingStrategy drivingStrategy){
        this.drivingStrategy = drivingStrategy;
    }
    public void drive(){
        drivingStrategy.drive();
    }
}
