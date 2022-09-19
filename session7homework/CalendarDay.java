package session7homework;
import java.util.Date;

import java.util.Calendar;
public class CalendarDay {
    public static void main(String[] args) {
        Calendar day = Calendar.getInstance();
        System.out.println("ngay:" + day);
        System.out.println(day.getTime());
        System.out.println(day.toInstant());
    }
}
