package DecoratorDesignPattern;

public class PlainPizza implements BasePizza{

  @Override
  public double cost() {
    return 100.00;
  }

  @Override
  public String description() {
    return "plain pizza";
  }
  
}
