//  Example 2: Count Number of Digits in an Integer using for loop
import java.util.Scanner;
public class Java_37 {
  public static void main(String[] args) {
       Scanner Sc = new Scanner(System.in);
       System.out.println("Enter the Number:");
       int num = Sc.nextInt();
       int count = 0;
       for (; num != 0; num /= 10, ++count) {
       }
       System.out.println("Number of digits: " + count);
  }
}
/* Output
Enter the Number:
456300
Number of digits: 6
*/