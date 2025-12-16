package oop4;
public class Main {
    public static void main(String[] args) {

        Calculator addition = (a, b) -> a + b;
        Calculator multiplication = (a, b) -> a * b;
        System.out.println("ADDITION :"+addition.operate(3,4));
        System.out.println("Multiplication :"+multiplication.operate(3,4));


        /// ////////////////////////        task2

        ChekDay.chekDay(DayOfWeek.SUNDAY);
        ChekDay.chekDay(DayOfWeek.MONDAY);
        /// ///////////////////////////////////////task3
        Traffic.movement(TrafficLight.RED);
        Traffic.movement(TrafficLight.YELLOW);
        Traffic.movement(TrafficLight.GREEN);
    }
}

