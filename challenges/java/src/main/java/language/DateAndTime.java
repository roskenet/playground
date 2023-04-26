package language;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAndTime {

    public static void main(String[] args) {
        var parsedDateTime = ZonedDateTime.parse("2023-04-01T23:35:04.123456+00:00");
        var londonDateTime = parsedDateTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        var berlinDateTime = parsedDateTime.withZoneSameInstant(ZoneId.of("Europe/Berlin"));

        System.out.println(String.format("In Berlin ist es dann: %s.", berlinDateTime));
        System.out.println(String.format("In London ist es dann: %s.", londonDateTime));
    }
}
