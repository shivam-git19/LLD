package StrategyDesignPattern;

public class Vehicle {
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        System.out.print("\n"+getClass().getSimpleName()+": ");
        driveStrategy.drive();
    }
}
