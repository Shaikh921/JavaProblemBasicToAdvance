// Example 1: Calculate power of a number using a while loop
import java.util.Scanner;
class Java_40 {
  public static void main(String[] args) {
  Scanner Sc = new Scanner(System.in);
   System.out.println("Enter the Base:");
   int Base = Sc.nextInt();
   System.out.println("Enter the Exponent:");
   int Exponent = Sc.nextInt();
    long result = 1;
    while (Exponent != 0) {
      result *= Base;
      --Exponent;
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