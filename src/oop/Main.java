package oop;

public class Main {
    public static void main(String[] args) {
        Car car =new Car();
        car.setBrand("BMW");
        car.setModel("M5");
        car.setYear("2025");
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println("\n");

/// ///////////////////////////////////////////////////////////////////////////////////
        Student student1=new Student("Elvin",21);
        Student student2=new Student("Ben",22);
        Student student3=new Student("Mike",23);
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        System.out.println("\n");
/// /////////////////////////////////////////////////////////////////////////////////////////
       Book book=new Book();
       Book book1=new Book("Qetil elan olunur ","Agatha Cristy",11);
        Book book2=new Book("Yer altindan qeydler","Fydor Dostoyevsky");
        System.out.println("\n");
        /// //////////////////////////////////////////////////////////////////////////////
     Person person=new Person();
        person.setName("Namiq");
        person.setHeight(180.2);
        System.out.println("Name: "+person.getName());
        System.out.println("Height: "+person.getHeight());
        person.personInfo();
        System.out.println("\n");
        /// /////////////////////////////////////
        Engine engine=new Engine(200);
        Car car1=new Car(engine);
        System.out.println("\n");
        /// //////////////////////
          Rectangle rectangle=new Rectangle(200,200);
        rectangle.getArea();
        rectangle.getPerimeter();
        System.out.println("\n");
        /// //////////////////////////////////////////////////////
        Address address =new Address("E.Eliyev","BAku",123);
        Employee  employee =new Employee("Namiq",1234,address);
        employee.showEmployeeDetails();
        System.out.println("\n");
        Address address1=new Address("M.Qluyev","BAku",122);
        Employee  employee1=new Employee("Qasim",3000,address1);
        employee1.showEmployeeDetails();

        System.out.println("\n");
        Address address2=new Address("M.Agayev","BAku",131);
        Employee  employee2=new Employee("Elvin",2000,address2);
        employee2.showEmployeeDetails();
    }
}
