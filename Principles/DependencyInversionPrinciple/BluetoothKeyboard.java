package Principles.DependencyInversionPrinciple;

public class BluetoothKeyboard implements Keyboard{

    public void getSpecification() {
        System.out.println("Bluetooth keyboard");
    }
}
