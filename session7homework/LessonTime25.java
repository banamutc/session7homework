package session7homework;

import java.util.Scanner;

import static session7homework.LessonTime18.isLeapYear;

public class LessonTime25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao nam : ");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " la nam nhuan");
            System.out.println("Thoi gian trong nam la: 365 ngay");
        } else {
            System.out.println(year + " ko la nam nhuan");
            System.out.println("Thoi gian trong nam la: 366 ngay");
        }

    }
}
