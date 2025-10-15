// Example 1: Program to Check Prime Number using a for loop
import java.util.Scanner;
public class Java_47 {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the Number:");
    int Num = Sc.nextInt();
    boolean flag = false;
    int i = 2;
        while (i <= Num / 2) {
      // condition for nonprime number
      if (Num % i == 0) {
        flag = true;
        break;
      }
      ++i;
    }

    if (!flag)
      System.out.println(Num + " is a prime number.");
    else
      System.out.println(Num + " is not a prime number.");
  }
}
/* Output
Enter the Number:
56
56 is not a prime number.
*/