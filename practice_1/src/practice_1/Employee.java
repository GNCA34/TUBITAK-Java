package practice_1;

public class Employee {
    String name;
    String designation;
    int age;
    double salary;
    public Employee(String name){
        this.name = name;
    }
    
    public void setAge(int empAge){
        age=empAge;

    }
    public void setDesignation(String empDesig){
        designation=empDesig;

    }
    public void setSalary(double empSalary){
        salary=empSalary;
    }
    public void printEmployee(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Designation: "+designation);
        System.out.println("Salary: "+salary);
        
    }


}
