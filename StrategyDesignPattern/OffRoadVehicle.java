package StrategyDesignPattern;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
