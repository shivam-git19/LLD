package StrategyDesignPattern;

public class Demo {
    public static void main(String[] args){
        NormalVehicle normalVehicle = new NormalVehicle(new NormalDrive());
        OffRoadVehicle offRoadVehicle = new OffRoadVehicle(new SportDrive());

        normalVehicle.drive();
        offRoadVehicle.drive();
    }
}
