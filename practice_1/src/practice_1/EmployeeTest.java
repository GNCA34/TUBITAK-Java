package practice_1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee empOne=new Employee("Jame Smith");
        Employee empTwo=new Employee("Mary Anne");

        empOne.setAge(26);
        empOne.setDesignation("Senior Software Engineer");
        empOne.setSalary(1000);
        empOne.printEmployee();

        empTwo.setAge(21);
        empTwo.setSalary(500);
        empTwo.setDesignation("Software Engineer");
        
        empTwo.printEmployee();   
    }

}
