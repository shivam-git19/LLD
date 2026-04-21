package Principles.DependencyInversionPrinciple;

public class BluetoothMouse implements Mouse{
    @Override
    public void getSpecification() {
        System.out.println("Bluetooth Mouse");
    }
}
