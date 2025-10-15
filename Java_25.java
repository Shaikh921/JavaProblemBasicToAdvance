// Example 2: Generate Multiplication Table using while loop
import java.util.Scanner;
public class Java_25 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = Sc.nextInt();
        int  i = 1;
        while(i <= 10)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
    }
}
/* Output
Enter the Number :
7
7 * 1 = 7 
7 * 2 = 14 
7 * 3 = 21 
7 * 4 = 28 
7 * 5 = 35 
7 * 6 = 42 
7 * 7 = 49 
7 * 8 = 56 
7 * 9 = 63 
7 * 10 = 70 
*/