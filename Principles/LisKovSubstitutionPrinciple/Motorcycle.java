package Principles.LisKovSubstitutionPrinciple;

public class Motorcycle extends Bike implements Engine{
    String company;
    boolean isEngineOn;
    int speed;

    public Motorcycle(String company, int speed){
        this.company = company;
        this.isEngineOn = isEngineOn;
        this.speed = speed;
    }

    @Override
    public void accelerate() {
        speed = speed + 10;
        System.out.println("Speed is: "+speed);
    }

    @Override
    public void brake() {
        System.out.println("Applying brake..."+(speed - 5));
    }

    @Override
    public void startEngine() {
        System.out.println("Turn on engine...");
    }

    @Override
    public void offEngine() {
        System.out.println("Turn off engine...");
    }
}
