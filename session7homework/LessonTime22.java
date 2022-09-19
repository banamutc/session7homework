package session7homework;


import java.time.LocalDateTime;

public class LessonTime22 {
    public static LocalDateTime addDay(int a) {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.plusDays(a);
    }

    public static void main(String[] args) {
        System.out.println("thoi gian sau khi cong them 10 ngay la : " + addDay(10));
        System.out.println("thoi gian sau khi tru di 10 ngay la : " + addDay(-10));
    }
}
