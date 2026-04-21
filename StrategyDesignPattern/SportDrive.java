package StrategyDesignPattern;

public class SportDrive implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Drive capability of vehicle: sports!");
    }
}
