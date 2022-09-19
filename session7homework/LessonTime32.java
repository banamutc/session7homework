package session7homework;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class LessonTime32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time : ");
        LocalDate birthDay = LocalDate.parse(scanner.nextLine());
        long age = Period.between(birthDay,LocalDate.now()).getYears();
        System.out.println("tuoi cua ban la : " + age);
    }
}
