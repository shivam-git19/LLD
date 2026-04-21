package Principles.InterfaceSegregationPrinciple;

public class Demo {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        chef.prepareFood();
        chef.decideMenu();

        waiter.takeOrder();
        waiter.serveFoodAndDrinks();
    }
}
