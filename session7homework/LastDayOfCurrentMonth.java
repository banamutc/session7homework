package session7homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class LastDayOfCurrentMonth {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        LocalDate date = LocalDate.now();
        System.out.println("Thoi gian hien tai la: " + date);

        int ngayCuoiThang = cal.getActualMaximum(Calendar.DATE);
        System.out.println("Ngay cuoi thang la: " + ngayCuoiThang);
    }
}
