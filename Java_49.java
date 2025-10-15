// Example: Armstrong Numbers Between Two Integers\
import java.util.Scanner;
public class Java_49 {
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the lower Number:");
    int Low = Sc.nextInt();
    System.out.println("Enter the Higher Number:");
    int High = Sc.nextInt();
        for(int number = Low + 1; number < High; ++number) {
            if (checkArmstrong(number))
                System.out.print(number + " ");
        }
    }
    public static boolean checkArmstrong(int num) {
        int digits = 0;
        int result = 0;
        int originalNumber = num;
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++digits;
        }
        originalNumber = num;
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }
        if (result == num)
            return true;
        return false;
    }
}
/* Output
Enter the lower Number:
78
Enter the Higher Number:
9999
153 370 371 407 1634 8208 9474 
*/