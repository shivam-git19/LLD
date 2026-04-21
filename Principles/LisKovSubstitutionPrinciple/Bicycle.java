package Principles.LisKovSubstitutionPrinciple;

public class Bicycle extends Bike {
    String brand;
    Boolean hasGears;
    int speed;

    public Bicycle(String brand, Boolean hasGears, int speed){
        this.brand = brand;
        this.hasGears = hasGears;
        this.speed = speed;
    }

    @Override
    public void accelerate() {
        speed = speed + 5;
        System.out.println("Speed is: "+speed);
    }

    @Override
    public void brake() {
        System.out.println("Applying brake..."+(speed - 5));
    }
}
