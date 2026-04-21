package StrategyDesignPattern;

public class NormalDrive implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Drive capability of vehicle: Normal!");
    }
}
