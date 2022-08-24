import java.time.*;
import java.util.*;

class AlterTimes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(
                System.in);

        System.out.println("Enter whether your choice 1:add 2:subtract ");
        int choice2 = scn.nextInt();
        System.out.println("Enter the field to change hours/minutes/seconds");
        String field = scn.next();
        System.out.println("Enter the value to change");
        long value = scn.nextLong();
        LocalTime localTime = LocalTime.now();
        System.out.println("original time:" + localTime);
        switch (choice2) {
            case 1:
                switch (field) {
                    case "hours":
                        localTime = localTime.plusHours(value);
                        System.out.println("modified time:" + localTime);
                        break;
                    case "minutes":
                        localTime = localTime.plusMinutes(value);
                        System.out.println("modified time:" + localTime);
                        break;
                    case "seconds":
                        localTime = localTime.plusSeconds(value);
                        System.out.println("modified time:" + localTime);
                        break;
                }
                break;
            case 2:
                switch (field) {
                    case "hours":
                        localTime = localTime.minusHours(value);
                        System.out.println("modified time:" + localTime);
                        break;
                    case "minutes":
                        localTime = localTime.minusMinutes(value);
                        System.out.println("modified time:" + localTime);
                        break;
                    case "seconds":
                        localTime = localTime.minusSeconds(value);
                        System.out.println("modified time:" + localTime);
                        break;
                }
                break;
            default:
                System.out.println("Enter input properly");
        }
    }
}