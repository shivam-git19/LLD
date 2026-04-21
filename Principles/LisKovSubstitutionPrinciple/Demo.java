package Principles.LisKovSubstitutionPrinciple;

public class Demo {
    public static void main(String[] args){
        Motorcycle motorCycle = new Motorcycle("HeroHonda", 10);
        Bicycle bicycle = new Bicycle("Hercules", true, 10);

        motorCycle.startEngine();
        motorCycle.accelerate();
        motorCycle.brake();
        motorCycle.offEngine();
        bicycle.accelerate();
        bicycle.brake();
    }
}
