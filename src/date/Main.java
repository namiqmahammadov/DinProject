package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        /// ////////////////////////////task1
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println("");
        /// /////////////////////task 2

        LocalDate age = LocalDate.of(2004, Month.AUGUST, 1);
        int day = age.getDayOfMonth();
        String suffix = suffix(day);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM yyyy");
        String birthday = day + suffix + " " + age.format(dateTimeFormatter);
        System.out.println(birthday);
        System.out.println("");
        /// //////////////////////////////////////////task3
        LocalDate speacialday = LocalDate.of(2020, Month.FEBRUARY, 02);
        System.out.println("Year :" + speacialday.getYear());

        System.out.println("Month :" + speacialday.getMonth());

        System.out.println("day of Month :" + speacialday.getDayOfMonth());
        System.out.println("");
        /// /////////////////////////////////////task4
        LocalDate date=LocalDate.of(1970,12,20);
            LocalDate date2=LocalDate.of(1950 ,12,12);
        LocalDate date3=LocalDate.of(1980 ,12,12);
        LocalDate date4=LocalDate.of(1970 ,12,20);
        System.out.println(date.isBefore(date3));
        System.out.println(date.isAfter(date2));
        System.out.println(date.isEqual(date4));


    }

    public static String suffix(int day) {
        if (day >= 11 && day <= 13) {
            return "th";
        }
        switch (day % 10) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";

        }
    }
}
