package datetime;

import java.time.*;
import java.util.*;

public class CalendarDateTime {
  public static void main(String[] args) {
    GregorianCalendar calendar = new GregorianCalendar();
    System.out.println("Current date and time: " + calendar.getTime());
    System.out.println("Current year: " + calendar.get(GregorianCalendar.YEAR));
    System.out.println("Current month: " + calendar.get(GregorianCalendar.MONTH));
    System.out.println("Current day of the month: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
    System.out.println("Current day of the week: " + calendar.get(GregorianCalendar.DAY_OF_WEEK));
    System.out.println("Current day of the year: " + calendar.get(GregorianCalendar.DAY_OF_YEAR));
    System.out.println("Current week of the month: " + calendar.get(GregorianCalendar.WEEK_OF_MONTH));
    System.out.println("Current week of the year: " + calendar.get(GregorianCalendar.WEEK_OF_YEAR));
    System.out.println("Current hour: " + calendar.get(GregorianCalendar.HOUR));
    System.out.println("Current hour of the day: " + calendar.get(GregorianCalendar.HOUR_OF_DAY));
    System.out.println("Current minute: " + calendar.get(GregorianCalendar.MINUTE));
    System.out.println("Current second: " + calendar.get(GregorianCalendar.SECOND));
    System.out.println("Current millisecond: " + calendar.get(GregorianCalendar.MILLISECOND));

    System.out.println("Is current year a leap year: " + calendar.isLeapYear(calendar.get(GregorianCalendar.YEAR)));

    TimeZone tz = calendar.getTimeZone();
    System.out.println("Time zone: " + tz.getDisplayName());

    LocalDate date = LocalDate.now();
    System.out.println("Current date: " + date);
    System.out.println("Current year: " + date.getYear());
    System.out.println("Current month: " + date.getMonth());
    System.out.println("Current day of the month: " + date.getDayOfMonth());
    System.out.println("Current day of the week: " + date.getDayOfWeek());
    System.out.println("Current day of the year: " + date.getDayOfYear());
    System.out.println("Is current year a leap year: " + date.isLeapYear());

    date = LocalDate.now(ZoneId.of("America/New_York"));
    System.out.println("Current date in New York: " + date);

    date = LocalDate.ofEpochDay(100000);
    System.out.println("Date after 100000 days: " + date);

    date = LocalDate.parse("2020-01-01");
    System.out.println("Parsed date: " + date);

    date = date.plusDays(100);
    System.out.println("Date after 100 days: " + date);

    LocalTime time = LocalTime.now();
    System.out.println("Current time: " + time);
    System.out.println("Current hour: " + time.getHour());
    System.out.println("Current minute: " + time.getMinute());
    System.out.println("Current second: " + time.getSecond());
    System.out.println("Current nanosecond: " + time.getNano());

    time = time.minusHours(10);
    System.out.println("Time after 10 hours: " + time);

    ZonedDateTime zdt = ZonedDateTime.now();
    System.out.println("Current date and time: " + zdt);

    OffsetDateTime odt = OffsetDateTime.now();
    System.out.println("Current date and time: " + odt);

    zdt = ZonedDateTime.now(ZoneId.of("America/New_York"));
    System.out.println("Current date and time in New York: " + zdt);

    MonthDay md = MonthDay.now();
    System.out.println("Current month and day: " + md);

    Period period = Period.of(1, 2, 3);
    System.out.println("Period: " + period);
    System.out.println(period.addTo(odt));

  }

}
