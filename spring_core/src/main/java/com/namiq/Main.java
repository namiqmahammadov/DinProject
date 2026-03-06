package com.namiq;

import com.namiq.model.Student;
import com.namiq.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

       var context = new ClassPathXmlApplicationContext("context.xml");

        StudentService service =
                (StudentService) context.getBean("studentService");
        Student student=(Student) context.getBean("Student");
        System.out.println(student.getName());
        service.display();
    }
}