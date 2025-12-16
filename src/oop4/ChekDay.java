package oop4;

public class ChekDay {
    public static void chekDay( DayOfWeek day){

        switch(day){
            case day.SUNDAY,day.SATURDAY->  System.out.println(day + " is a weekend");
            default -> System.out.println(day + " is a weekday");


        }
    }
}
