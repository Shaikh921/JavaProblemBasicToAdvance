// Example 137: Check birthday and return Happy Birthday message

import java.time.LocalDate;
import java.time.Month;

class java_137 {
  public static void main(String args[]) {
    int birthDate = 23;
    Month birthMonth = Month.SEPTEMBER;

    LocalDate currentDate = LocalDate.now();
    System.out.println("Today's Date: " + currentDate);

    int date = currentDate.getDayOfMonth();
    Month month = currentDate.getMonth();

    if (date == birthDate && month == birthMonth) {
      System.out.println("HAPPY BIRTHDAY TO YOU !!");
    } else {
      System.out.println("Today is not my birthday.");
    }
  }
}

/*
Output
Today's Date: 2025-09-23
HAPPY BIRTHDAY TO YOU !!
*/
