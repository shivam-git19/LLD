package AbstractFactoryDesignPattern;

public class Demo {

  public static void main(String[] args){

    Employee employee = EmployeeFactory.getEmployee(new JavaDevFactory());
    System.out.println(employee.getSalary());

    Employee employee2 = EmployeeFactory.getEmployee(new SoftwareEngDevFactory());
    System.out.println(employee2.getSalary());

  }
  
}
