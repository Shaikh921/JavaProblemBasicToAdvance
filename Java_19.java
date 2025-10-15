// Example 1: Sum of Natural Numbers using for loop
import java.util.Scanner;
public class Java_19 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int Number = Sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= Number; ++i)
        {
            // sum = sum + i;
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
/* Ouput
Enter the Number :
45
Sum = 1035
*/