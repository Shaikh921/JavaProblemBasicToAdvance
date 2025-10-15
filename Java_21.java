// Example 1: Find Factorial of a number using for loop
import java.util.Scanner;
public class Java_21 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = Sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
/* Ouput
Enter the Number :
8
Factorial of 8 = 40320
*/