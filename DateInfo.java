import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class DateInfo {
    public static void main(String[] args) {
        System.out.println("Enter --month/monthValue/year");
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        LocalDate localDate = LocalDate.now();
        switch (str) {
            case "monthValue":
                System.out.println(localDate.getMonthValue());
                break;
            case "month":
                System.out.println(localDate.getMonth());
                break;
            case "year":
                System.out.println(localDate.getYear());
                break;
            default:
                System.out.println("invalit input Enter --month/monthValue/year ");
        }
    }
}