import java.time.*;
import java.util.*;

class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Date to Check:Format[YYYY-MM-DD]");
        String str = scn.next();
        LocalDate localDate = LocalDate.parse(str);
        System.out.println(localDate.isLeapYear());
    }
}