
import java.util.Scanner;
// Example: Compute Quotient and Remainder
public class Java_4 {
    public static void main(String[] args) {
        System.out.println("Enter the Numbers :");
        Scanner Sc = new Scanner(System.in);
        int dividend = Sc.nextInt();
        int divisor = Sc.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
    System.out.println("Quotient = " + quotient);
    System.out.println("Remainder = " + remainder);
    }
}
/* Output:
Enter the Numbers :
5
2
Quotient = 2
Remainder = 1
*/
