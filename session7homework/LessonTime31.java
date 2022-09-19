package session7homework;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class LessonTime31 {
    public static void main(String[] args) {
        LocalDateTime startDate = LocalDateTime.of(2001, 12, 14, 4, 15, 39);
        LocalDateTime endDate = LocalDateTime.of(2022, 11, 1, 10, 1, 8);
        long differentInSeconds = Duration.between(startDate, endDate).getSeconds();
        long differentInHours = Duration.between(startDate, endDate).toHours();
        long differentInMinutes = Duration.between(startDate, endDate).toMinutes();
        System.out.println("su chenh lech giua ngay bat dau vaf ngay ket thuc la " + differentInSeconds + " giay tuong ung voi " + differentInMinutes + " phut va tuong ung voi " + differentInHours + " gio.");
    }
}
