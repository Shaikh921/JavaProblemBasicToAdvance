// Example 1: Count Number of Digits in an Integer using while loop
import java.util.Scanner;
public class Java_36 {
  public static void main(String[] args) {
      Scanner Sc = new Scanner(System.in);
       System.out.println("Enter the Number:");
      int num = Sc.nextInt(); 
    int count = 0;
    while (num != 0) {
      // num = num/10
      num /= 10;
      ++count;
    }
    System.out.println("Number of digits: " + count);
  }
}

/* Output
Enter the Number:
4563
Number of digits: 4
*/
