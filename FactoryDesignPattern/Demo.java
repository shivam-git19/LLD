package FactoryDesignPattern;

public class Demo {
  
  public static void main(String[] args){

    Employee employee = EmployeeFactory.getEmployee("JAVA DEVELOPER");
    int salary = employee.getSalary();
    System.out.println(salary);

    Employee employee2 = EmployeeFactory.getEmployee("SOFTWARE ENGINEER");
    int salary2 = employee2.getSalary();
    System.out.println(salary2);

  }
}
