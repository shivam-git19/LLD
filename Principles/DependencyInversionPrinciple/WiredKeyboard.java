package Principles.DependencyInversionPrinciple;

public class WiredKeyboard implements Keyboard{
    @Override
    public void getSpecification() {
        System.out.println("Wire keyboard");
    }
}
