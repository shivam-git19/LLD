package AbstractFactoryDesignPattern;

public class SoftwareEngDevFactory extends EmployeeAbstractFactory{

  @Override
  public Employee createEmployee() {
    return new SoftwareEngineer();
  }
  
}
