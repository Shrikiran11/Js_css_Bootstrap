import java.time.*;
import java.util.*;

class MedicineAlert {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String time = scn.next();
        LocalTime localTime = LocalTime.now();
        LocalTime alertTime = LocalTime.parse(time);
        int hourCurrent = localTime.getHour();
        int alertHour = alertTime.getHour();
        int minuteCurrent = localTime.getMinute();
        int alertMinute = alertTime.getMinute();
        int alertSecond = alertTime.getSecond();
        int secondCurrent = localTime.getSecond();
        if (localTime == alertTime) {
            System.out.println("Time To Take Medicine");
        } else if (hourCurrent < alertHour && minuteCurrent != alertMinute) {
            System.out.println("Time Remaining is:" + (hourCurrent - alertHour) + "hours"
                    + (minuteCurrent - alertMinute) + "minutes");

        } else if (hourCurrent > alertHour) {
            System.err.println("Time Exceeded");
        } else if (hourCurrent == alertHour && minuteCurrent > alertMinute) {
            System.out.println("take medicine immediately");
        } else if (hourCurrent == alertHour && minuteCurrent < alertMinute) {
            System.out.println((alertMinute - minuteCurrent) + " minutes Remaining");
        } else if (hourCurrent == alertHour && minuteCurrent == alertMinute) {
            System.out.println("its time");
        }

    }
}