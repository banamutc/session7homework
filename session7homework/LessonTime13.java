package session7homework;

import java.time.LocalDate;

public class LessonTime13 {
    public static void main(String[] args) {
        LocalDate time13 = LocalDate.of(2001, 12, 14);
        String day = String.valueOf(time13.getDayOfWeek());
        System.out.println("thu : " + day);
    }
}
