// Example: Program to Add Two Integers
import java.util.Scanner;
class Java_1 {
  public static void main(String[] args) {
   System.out.println("Enter two numbers");
   Scanner Sc = new Scanner(System.in);
    int first = Sc.nextInt();
    int second = Sc.nextInt();
    int sum = first + second;
    System.out.println("The sum is: " + sum);
  }
}
/* Output:
Enter two numbers           
5
7
The sum is: 12
*/