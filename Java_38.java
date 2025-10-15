// Example 1: Reverse a Number using a while loop in Java
import java.util.Scanner;
class Java_38 {
  public static void main(String[] args) {
   Scanner Sc = new Scanner(System.in);
   System.out.println("Enter the Number:");
   int num = Sc.nextInt();
    int  reversed = 0;
    while(num != 0) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;
    }
    System.out.println("Reversed Number: " + reversed);
  }
}
/* Output
Enter the Number:
7865
Reversed Number: 5687
*/