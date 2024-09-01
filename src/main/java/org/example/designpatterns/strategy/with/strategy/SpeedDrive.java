package org.example.designpatterns.strategy.with.strategy;

public class SpeedDrive implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("drive fast");
    }
}
