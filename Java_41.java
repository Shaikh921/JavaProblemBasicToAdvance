// Example 2: Calculate the power of a number using a for loop
import java.util.Scanner;
class Java_41 {
  public static void main(String[] args) {
  Scanner Sc = new Scanner(System.in);
   System.out.println("Enter the Base:");
   int Base = Sc.nextInt();
   System.out.println("Enter the Exponent:");
   int Exponent = Sc.nextInt();
    long result = 1;
    for (; Exponent != 0; --Exponent) {
      result *= Base;
    }

    System.out.println("Answer = " + result);
  }
}
/* Output
Enter the Base:
2
Enter the Exponent:
10
Answer = 1024
*/