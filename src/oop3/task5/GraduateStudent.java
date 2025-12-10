package oop3.task5;

public class GraduateStudent extends Student {
    private Double bonus;

    public GraduateStudent(String name, Double grade, Double bonus) {
        super(name, grade);
        this.bonus = bonus;
    }

    @Override
    public Double getFinalGrade() {
        return getGrade() + bonus;

    }
}
