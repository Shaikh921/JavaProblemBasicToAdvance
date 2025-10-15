// Example 1: Generate Multiplication Table using for loop
import java.util.Scanner;
public class Java_24 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = Sc.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}
/* Output
Enter the Number :
6
6 * 1 = 6 
6 * 2 = 12 
6 * 3 = 18 
6 * 4 = 24 
6 * 5 = 30 
6 * 6 = 36 
6 * 7 = 42 
6 * 8 = 48 
6 * 9 = 54 
6 * 10 = 60 
*/