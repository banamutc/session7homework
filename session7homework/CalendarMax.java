package session7homework;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class CalendarMax {
    public static void main(String[] args) {
        LocalDateTime minYear = LocalDateTime.MAX;
        LocalTime minMonth = LocalTime.MAX;
        System.out.println(minYear + " " + minMonth);
        System.out.println(minMonth);
    }
}
