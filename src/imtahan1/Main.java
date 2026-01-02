package imtahan1;

public class Main {
    public static void main(String[] args) {
        /// //////////////task1
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 9);
        circle.area();
        rectangle.area();

        /// ////task2
        divide(5, 1);
        /// ///////////////task3
        Person person1=new Person("Namiq",22);
        Person person2=new Person("Elvin ",22);
        System.out.println(person1);
        System.out.println(person2);
        /// ////////////////////////task4
        WashingMachine washingMachine=new WashingMachine(1,399.99,"Vestel",1);

        washingMachine.finalPrice(30);
        washingMachine.warranty(3);
        System.out.println(washingMachine);
        /// ///////////////////task5
        OnlineCourse onlineCourse=new OnlineCourse("java","Huseyn m",1000.0,"udemy",100);
        onlineCourse.printInfo();
        onlineCourse.hasCertificate(100);
        onlineCourse.hasCertificate(20);

    }


    public static void divide(int a, int b) {
        if (b == 0) {
            throw new SifiraBolmekOLmazException("Herhansisa bir ededi sifira bolmek olmaz");
        }
        try {
            int netice = a / b;
        } catch (SifiraBolmekOLmazException e) {
            e.getMessage();
        }
    }


}
