// dang sai bai nay
package session7homework;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class LastDayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        System.out.println("Nhap thang: ");
        LocalDate datee = LocalDate.parse(sc.nextLine());
        int ngayCuoiThang = cal.getActualMaximum(Calendar.DATE);
        System.out.println("Ngay cuoi thang la: " + ngayCuoiThang);
    }
}
