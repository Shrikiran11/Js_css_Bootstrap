import java.time.*;
import java.util.*;

class BookingWindow {
    public static void main(String[] args) {
        System.out.println("Dreaming of buying Techno Pova1 phone Buy one now");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the endTime in Format[HH:MM:SS]");
        String time1 = scn.next();
        System.out.println("Enter the startTime in Format[HH:MM:SS]");
        String time2 = scn.next();
        LocalTime localTime = LocalTime.now();
        LocalTime endTime = LocalTime.parse(time1);
        LocalTime startTime = LocalTime.parse(time2);
        int difference1 = localTime.compareTo(endTime);
        int difference2 = localTime.compareTo(startTime);
        if (difference1 <= 0 && difference2 >= 0) {
            System.out.println("Booking open");
        } else {
            System.out.println("Booking window unavailable");
        }
    }
}