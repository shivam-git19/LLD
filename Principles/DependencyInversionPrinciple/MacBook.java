package Principles.DependencyInversionPrinciple;

public class MacBook {
    private Keyboard keyboard;
    private Mouse mouse;

    public MacBook(Keyboard keyboard, Mouse mouse){
        this.keyboard = keyboard;
        this.mouse =mouse;
    }

    public Mouse getMouse(){
        mouse.getSpecification();
        return mouse;
    }

    public Keyboard getKeyboard() {
        keyboard.getSpecification();
        return keyboard;
    }
}
