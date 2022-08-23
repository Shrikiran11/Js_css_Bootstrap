import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class ModifyDate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the operation Add/Subtract");
        String operation = scn.next();
        System.out.println("Enter field month/day/year/week");
        String field = scn.next();
        System.out.println("Operate value");
        long value = scn.nextLong();

        LocalDate localDate = LocalDate.now();
        switch (operation) {
            case "subtract":
                switch (field) {
                    case "day":
                        LocalDate newDate = localDate.minusDays(value);
                        System.out.println(newDate);
                        break;
                    case "week":
                        LocalDate newDate1 = localDate.minusWeeks(value);
                        System.out.println(newDate1);
                        break;
                    case "month":
                        LocalDate newDate2 = localDate.minusMonths(value);
                        System.out.println(newDate2);
                        break;
                    case "year":
                        LocalDate newDate3 = localDate.minusYears(value);
                        System.out.println(newDate3);
                        break;
                }
                break;
            case "add":
                switch (field) {
                    case "day":
                        LocalDate newDate4 = localDate.plusDays(value);
                        System.out.println(newDate4);
                        break;
                    case "week":
                        LocalDate newDate5 = localDate.plusWeeks(value);
                        System.out.println(newDate5);
                        break;
                    case "month":
                        LocalDate newDate6 = localDate.plusMonths(value);
                        System.out.println(newDate6);
                        break;
                    case "year":
                        LocalDate newDate7 = localDate.plusYears(value);
                        System.out.println(newDate7);
                        break;
                }
                break;
        }

    }
}