package oop2;

public class Meneger extends Employee{

    public Meneger(String name, Integer age, double salary) {
        super(name, age, salary);

    }


    @Override
    public double calculateSalary() {
        return getSalary() + 500; // Manager bonus
    }
}
