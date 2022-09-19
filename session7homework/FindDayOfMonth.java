package session7homework;

import java.util.Scanner;

public class FindDayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input thang: ");
        int month = sc.nextInt();
        System.out.println("input nam: ");
        int year = sc.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("month " + month + " have 31 day "); break;
            case 4: case 6: case 9: case 11:
                System.out.println("month " + month + " have 30 day "); break;
            case 2:
                if ( year %400 == 0 || ( year %4 == 0 && year %100 != 0 )) {
                    System.out.println("month " + month + " have 29 day");
                }
                else {
                    System.out.println("month " + month + " have 28 day");
                }
            default:
                System.out.println("month ko hop le");
                break;
        }
    }
}
