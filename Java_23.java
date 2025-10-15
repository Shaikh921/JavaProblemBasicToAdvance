// Example 3: Find Factorial of a number using while loop
import java.util.Scanner;
public class Java_23 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = Sc.nextInt();
        int i = 1;
        long factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
/* Ouput
Enter the Number :
8
Factorial of 8 = 40320
*/