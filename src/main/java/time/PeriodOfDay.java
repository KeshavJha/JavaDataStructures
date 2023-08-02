package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class PeriodOfDay {
    public static void main(String[] args) {

        System.out.println(Objects.equals(null, null));
        System.out.println(Objects.deepEquals(null, null));


        String timeBeingTested = "2023-03-23T12:30:15.111";
        System.out.println(LocalDateTime.parse(timeBeingTested).atZone(ZoneId.systemDefault()));
        periodOfDayFromDateTime(timeBeingTested, "MM-dd-yyyy h B");
        periodOfDayFromDateTime(timeBeingTested, "MM-dd-yyyy h a");
//        periodOfDayFromDateTime("2023-03-23T12:30:15.111", DateTimeFormatter.ISO_OFFSET_DATE);  // OFFSET_TIME failing with error -- java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: OffsetSeconds
    }

    private static void periodOfDayFromDateTime(String time, String pattern) {
        LocalDateTime timeNow = LocalDateTime.parse(time);

        DateTimeFormatter from = DateTimeFormatter.ofPattern(pattern);
        System.out.printf("Time %s represented %s format is : %s\n", time, pattern, timeNow.format(from));
    }

    private static void periodOfDayFromDateTime(String time, DateTimeFormatter formatter) {
        LocalDateTime timeNow = LocalDateTime.parse(time);

        System.out.printf("Time %s represented %s format is : %s\n", time, formatter.toString(), timeNow.format(formatter));
    }
}
