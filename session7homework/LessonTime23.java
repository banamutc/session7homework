package session7homework;

import java.time.LocalDate;

public class LessonTime23 {
    public static void main(String[] args) {
        LocalDate time = LocalDate.now();
        int month = time.getMonth().getValue();
        System.out.println("cac thang con lai la : ");
        for (int i = month + 1; i <= 12; i++) {
            System.out.print(i + ", ");
        }
    }
}
