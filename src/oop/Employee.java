package oop;

public class Employee {
private String name;
private Integer salary;
private Address address;

    public Employee(String name, Integer salary, Address address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
    public void showEmployeeDetails()
    {


        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
          address.showAddress();
    }
}
