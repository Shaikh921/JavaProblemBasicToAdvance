// Example 2: Sum of Natural Numbers using while loop
import  java.util.Scanner;
public class Java_20 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = Sc.nextInt();
        int  i = 1, sum = 0;
        while(i <= num)
        {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}

/* Ouput
Enter the Number :
30
Sum = 465
*/