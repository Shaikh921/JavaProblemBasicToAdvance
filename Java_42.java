// Example 2: Calculate the power of a number using a for loop
import java.util.Scanner;
class Java_42 {
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
5
Enter the Exponent:
2
Answer = 25.0
*/