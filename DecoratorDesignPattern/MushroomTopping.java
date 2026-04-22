package DecoratorDesignPattern;

public class MushroomTopping extends Toppings{
  
  public MushroomTopping(BasePizza basePizza){
    super(basePizza);
  }

  @Override
  public double cost() {
    return basePizza.cost() + 10.00;
  }

  @Override
  public String description() {
    return basePizza.description() + " Mushrooms added.";
  }

  
}
