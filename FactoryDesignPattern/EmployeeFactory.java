package FactoryDesignPattern;

public class EmployeeFactory {

  public static Employee getEmployee(String empType){
    if(empType.trim().equalsIgnoreCase("SOFTWARE ENGINEER"))
      return new SoftwareEngineer();
    else if(empType.trim().equalsIgnoreCase("JAVA DEVELOPER"))
      return new JavaDeveloper();
    else 
      return null;
  }
  
}
