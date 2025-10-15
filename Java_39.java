// Example 1: Reverse a Number using a while loop in Java
import java.util.Scanner;
class Java_39{
  public static void main(String[] args) {
   Scanner Sc = new Scanner(System.in);
   System.out.println("Enter the Number:");
   int num = Sc.nextInt();
    int  reversed = 0;
      for(;num != 0; num /= 10) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
    }
    System.out.println("Reversed Number: " + reversed);
  }
}
/* Output
Enter the Number:
9978
Reversed Number: 8799
*/