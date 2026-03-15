package com.namiq.imtahan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Imtahan5ciAyDavamApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationcontext.xml");
        Car car= (Car) applicationContext.getBean("Car");
        Engine engine= (Engine) applicationContext.getBean("Engine");
        System.out.println(engine);
        System.out.println(car);
    }


}
