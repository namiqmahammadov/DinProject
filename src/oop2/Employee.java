package oop2;

public class Employee extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public Employee(String name, Integer age, double salary) {
        super(name, age);
        this.salary=salary;
    }

    public double calculateSalary() {
        return salary;
    }
}
