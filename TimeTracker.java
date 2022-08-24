import java.time.*;
import java.util.*;

class TimeTracker {
    public static void main(String[] args) {
        System.out.println("Enter the max time in format[HH:MM:SS]");
        Scanner scn = new Scanner(System.in);
        String time = scn.next();
        LocalTime localTime = LocalTime.now();
        LocalTime maxTime = LocalTime.parse(time);
        if (localTime.equals(maxTime) || localTime.isBefore(maxTime)) {
            System.out.println("Welcome arrived on time");
        } else if (localTime.isAfter(maxTime)) {
            System.out.println("you are late wait near the gate until Pt sir arrives");
        } else {
            System.out.println("hey Enter valid input in format[HH:MM:SS]");
        }
    }
}