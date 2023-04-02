package language;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateAndTime {

    public static void main(String[] args) {
        Date myDate = null;

        // Resolution to miilisecs.
        var parsedDateTime = ZonedDateTime.parse("2023-04-02T00:35:04.123456+02:00");

        var myTime = LocalDateTime.from(parsedDateTime);
        System.out.println(myTime);
    }
}
