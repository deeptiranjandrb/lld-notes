package org.example.designpatterns.strategy.with;

import org.example.designpatterns.strategy.with.strategy.DrivingStrategy;
import org.example.designpatterns.strategy.with.strategy.RuggedDrive;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle() {
        super(new RuggedDrive());
    }

}
