package session7homework;

import java.time.LocalDateTime;

public class LessonTime17 {
    public static LocalDateTime addYear (int a ) {
        LocalDateTime timeNow = LocalDateTime.now();
        return timeNow.plusYears(a);
    }

    public static void main(String[] args) {
        System.out.println(addYear(1));
        System.out.println(addYear(-1));
    }
}
