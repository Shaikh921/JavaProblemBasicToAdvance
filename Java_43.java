// Example 2: Calculate the power of a number using a for loop
import java.util.Scanner;
class Java_43 {
  public static void main(String[] args) {
  Scanner Sc = new Scanner(System.in);
   System.out.println("Enter the Base:");
   int Base = Sc.nextInt();
   System.out.println("Enter the Exponent:");
   int Exponent = Sc.nextInt();
    double result = Math.pow(Base, Exponent);
    System.out.println("Answer = " + result);
  }
}
/* Output
Enter the Base:
-7
Enter the Exponent:
3
Answer = -343.0
*/