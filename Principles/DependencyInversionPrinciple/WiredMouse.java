package Principles.DependencyInversionPrinciple;

public class WiredMouse implements Mouse{
    @Override
    public void getSpecification() {
        System.out.println("Wire mouse");
    }
}
