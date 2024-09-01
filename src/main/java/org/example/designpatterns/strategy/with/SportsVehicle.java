package org.example.designpatterns.strategy.with;

import org.example.designpatterns.strategy.with.strategy.SpeedDrive;

public class SportsVehicle extends Vehicle{

    public SportsVehicle() {
        super(new SpeedDrive());
    }
}
