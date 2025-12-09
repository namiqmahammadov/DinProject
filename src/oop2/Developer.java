package oop2;

public class Developer extends Employee {
    public Developer(String name, Integer age, double salary) {
        super(name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return getSalary() + 900 ; // Manager bonus
    }
}
