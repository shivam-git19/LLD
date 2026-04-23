package FactoryDesignPattern;

public class JavaDeveloper implements Employee {

  @Override
  public int getSalary() {
    System.out.println("Salary of Java Developer is: ");
    return 70000;
  }
  
}
