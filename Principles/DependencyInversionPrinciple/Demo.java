package Principles.DependencyInversionPrinciple;

public class Demo {
    public static void main(String[] args){
        WiredKeyboard wiredKeyboard = new WiredKeyboard();
        WiredMouse wiredMouse = new WiredMouse();
        BluetoothKeyboard bluetoothKeyboard = new BluetoothKeyboard();
        BluetoothMouse bluetoothMouse = new BluetoothMouse();
        MacBook macBook = new MacBook(wiredKeyboard, bluetoothMouse);
        macBook.getMouse();
        macBook.getKeyboard();
    }
}
