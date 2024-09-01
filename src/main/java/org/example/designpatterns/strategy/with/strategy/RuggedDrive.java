package org.example.designpatterns.strategy.with.strategy;

public class RuggedDrive implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("drive in rugged road");
    }
}
