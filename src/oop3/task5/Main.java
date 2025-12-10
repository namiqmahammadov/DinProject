package oop3.task5;

import oop3.task2.Animal;
import oop3.task2.Elephant;
import oop3.task2.Leon;
import oop3.task2.Monkey;

public class Main {
    public static void main(String[] args) {

        GraduateStudent graduateStudent = new GraduateStudent("Namiq", 85.5, 90.0);
        System.out.println(graduateStudent.getFinalGrade());
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Elvin", 65.3);
        System.out.println(undergraduateStudent.getFinalGrade());
    }
}
