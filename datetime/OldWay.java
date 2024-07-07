package datetime;

import java.sql.Date;

public class OldWay {
  public static void main(String[] args) {
    // Old way of getting date and time
    long millis = System.currentTimeMillis();
    System.out.println("Milliseconds since 1970: " + millis);
    Date date = new Date(millis);
    System.out.println("Date and time: " + date);
    date = new Date(0);
    System.out.println("Date and time: " + date);

    System.out.println("Date " + date.getDate());
    System.out.println("Month " + date.getMonth());
    System.out.println("Year " + date.getYear());

  }
}
