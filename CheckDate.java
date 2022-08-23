import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class CheckDate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First Date");
        String date1 = scn.next();
        System.out.println("Enter Second Date");
        String date2 = scn.next();
        LocalDate localDate1 = LocalDate.parse(date1);
        LocalDate localDate2 = LocalDate.parse(date2);
        boolean checkDate1 = localDate1.isAfter(localDate2);
        boolean checkDate2 = localDate1.isBefore(localDate2);
        boolean checkDate3 = localDate1.isEqual(localDate2);
        if (checkDate1) {
            System.out.println("date1 is after date2");
        } else if (checkDate2) {
            System.out.println("date1 is before date2");
        } else if (checkDate3) {
            System.out.println("date1 is equal to date2");
        } else {
            System.out.println("invalid input");
        }
    }
}