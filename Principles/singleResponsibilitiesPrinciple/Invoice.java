package Principles.singleResponsibilitiesPrinciple;

public class Invoice{
    private Marker marker;
    private int quantity;
    private int total;

    public void CalculateTotal(Marker marker){
        System.out.println("Calculating total...");
        this.total = this.marker.price * this.quantity;
    }
}
