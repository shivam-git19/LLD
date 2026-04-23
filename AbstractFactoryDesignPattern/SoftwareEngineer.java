package AbstractFactoryDesignPattern;

public class SoftwareEngineer implements Employee{

  @Override
  public int getSalary() {

    System.out.println("Salary of Software Engineer is: ");
    return 50000;
    
  }
}
