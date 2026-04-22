package DecoratorDesignPattern;

public abstract class Toppings implements BasePizza{
  
  BasePizza basePizza;
  
  Toppings(BasePizza basePizza){
    this.basePizza = basePizza;
  }

}
