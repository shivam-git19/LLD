package DecoratorDesignPattern;

public class Demo {
  public static void main(String[] args) {
    
    BasePizza basePizza = new PlainPizza();
    System.out.println("Order 1: "+basePizza.description()+" = $"+basePizza.cost());

    BasePizza basePizza2 = new FarmHousePizza();
    System.out.println("Order 2: "+basePizza2.description()+" = $"+basePizza2.cost());

    BasePizza basePizza3 = new CheeseTopping(new FarmHousePizza());
    System.out.println("Order 3: "+basePizza3.description()+" = $"+basePizza3.cost());

    BasePizza basePizza4 = new MushroomTopping(new PlainPizza());
    System.out.println("Order 4: "+basePizza4.description()+" = $"+basePizza4.cost());
  }
}
