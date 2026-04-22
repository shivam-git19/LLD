package DecoratorDesignPattern;

public class FarmHousePizza implements BasePizza{

  @Override
  public double cost() {
    return 120.00;
  }

  @Override
  public String description() {
    return "Farmhouse Pizza";
  }
  
}
