// Example 2: Find Factorial of a number using BigInteger
import java.math.BigInteger;
import java.util.Scanner;
public class Java_22{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = Sc.nextInt();
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
/* Ouput
Enter the Number :
8
Factorial of 8 = 40320
*/
