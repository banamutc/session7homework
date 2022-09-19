package session7homework;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;

public class InformationCalendar {
    public static void main(String[] args) {
        Calendar day1 = Calendar.getInstance();
        System.out.println(day1);
        System.out.println(day1.getTime());
        System.out.println();
        LocalDateTime day = LocalDateTime.of(2001, Month.DECEMBER,14 , 14 ,12);
        System.out.println(day);
        System.out.println();
        LocalDateTime day2 = LocalDateTime.now();
        System.out.println(day2);
    }
}
