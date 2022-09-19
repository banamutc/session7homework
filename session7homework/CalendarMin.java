package session7homework;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class CalendarMin {
    public static void main(String[] args) {
        LocalDateTime minYear = LocalDateTime.MIN;
        LocalTime minMonth = LocalTime.MIN;
        System.out.println(minYear + " " + minMonth);
        System.out.println(minMonth);
    }
}
