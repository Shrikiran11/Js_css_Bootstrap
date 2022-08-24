import java.util.*;
import java.time.*;

class CountryTime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the country to get time");
        String str = scn.next();

        // create a clock
        ZoneId zid = ZoneId.of(str);

        // create an ZonedDateTime object using now(zoneId)
        ZonedDateTime lt = ZonedDateTime.now(zid);

        // print result
        System.out.println("ZonedDateTime : "
                + lt);
    }
}