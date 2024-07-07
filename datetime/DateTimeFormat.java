package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

/**
 * DateTimeFormat
 * y - year
 * M - month
 * d - day
 * h - hour(12)
 * H - hour(24)
 * m - minute
 * s - second
 * S - millisecond
 * E - day name
 * e - day number
 * a - am/pm
 * z - time zone
 * Z - zone offset
 */
public class DateTimeFormat {
  public static void main(String[] args) {
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println("Current date and time: " + dateTime);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy*MM*dd HH_mm::ssa E e");
    String formattedDateTime = dateTime.format(formatter);
    System.out.println("Formatted date and time: " + formattedDateTime);

    System.out.println(dateTime.get(ChronoField.ALIGNED_WEEK_OF_YEAR));
  }
}
