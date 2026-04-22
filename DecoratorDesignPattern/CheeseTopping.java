package DecoratorDesignPattern;

public class CheeseTopping extends Toppings{

  public CheeseTopping(BasePizza basePizza){
    super(basePizza);
  }

  @Override
  public double cost() {
    return basePizza.cost() + 20.00;
  }

  @Override
  public String description() {
    return basePizza.description()+" Extra Cheese.";
  }

  
  
}
