package org.example.designpatterns.strategy.with.strategy;

import org.example.designpatterns.strategy.with.strategy.DrivingStrategy;

public class RuggedDrive implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("drive in rugged road");
    }
}
