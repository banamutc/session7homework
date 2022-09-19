package session7homework;

import java.time.LocalDateTime;

public class AddHour {
    public static LocalDateTime addHour(int a) {
        LocalDateTime timeNow = LocalDateTime.now();
        return timeNow.plusHours(a);
    }

    public static void main(String[] args) {
        System.out.println("thoi gian sau khi cong them h la : " + addHour(10000));
    }
}
