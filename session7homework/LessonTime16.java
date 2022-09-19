package session7homework;

import java.time.LocalDateTime;

public class LessonTime16 {
    public static LocalDateTime addWeek (int a ) {
        LocalDateTime timeNow = LocalDateTime.now();
        return timeNow.plusWeeks(a);
    }

    public static void main(String[] args) {
        System.out.println("thoi gian sau 2 tuan la : " + addWeek(2));
    }
}
