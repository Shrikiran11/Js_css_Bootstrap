import java.time.*;
import java.util.*;
import java.time.temporal.*;

class TimeTable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter deadLine for Playing");
        String str = scn.next();
        LocalTime localTime = LocalTime.now();
        LocalTime deadLine = LocalTime.parse(str);
        LocalTime myTime = LocalTime.now();
        long time = localTime.until(deadLine, ChronoUnit.HOURS);
        System.out.println("time remaining to play " + time + "hours");
        System.out.println("Do you want to alter Time [true/false]");
        boolean status = scn.nextBoolean();
        if (status = true) {
            System.out.println("Enter time to extend");
            int add = scn.nextInt();
            LocalTime newTime = myTime.plusHours(add);
            System.out.println("newTime" + newTime);
        }

    }
}