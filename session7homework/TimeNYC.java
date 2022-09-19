package session7homework;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeNYC {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("Americas/New York"));

        System.out.println("Thoi gian hien tai cua new york là " +
                cal.get(Calendar.HOUR_OF_DAY) + ":" +
                cal.get(Calendar.MINUTE) + ":" +
                cal.get(Calendar.SECOND));
    }
}
