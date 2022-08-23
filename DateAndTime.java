import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class DateAndTime {
    public static void main(String[] args) {
        System.out.println("Enter date/time/dateAndTime");
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        switch (str) {
            case "date":
                LocalDate localDate = LocalDate.now();
                System.out.println(localDate);
                break;
            case "time":
                LocalTime localTime = LocalTime.now();
                System.out.println(localTime);
                break;
            case "dateAndTime":
                LocalDateTime localDateTime = LocalDateTime.now();
                System.out.println(localDateTime);
                break;
            default:
                System.out.println("invalit input Enter --date/time/dateAndTime ");
        }
    }
}