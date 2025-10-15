// Example: Java Program to Check a Leap Year
import java.util.Scanner;

public class Java_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int Year = scanner.nextInt();
        scanner.close();

        boolean isLeap = false;

        if (Year % 400 == 0) {
            isLeap = true;
        } else if (Year % 100 == 0) {
            isLeap = false; // Century years not divisible by 400 are not leap years
        } else if (Year % 4 == 0) {
            isLeap = true;
        }

        if (isLeap) {
            System.out.println(Year + " is a Leap Year.");
        } else {
            System.out.println(Year + " is not a Leap Year.");
        }
    }
}
/* output:
Enter a year: 2020
2020 is a Leap Year.
*/