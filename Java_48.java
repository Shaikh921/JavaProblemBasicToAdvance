// Example: Prime Numbers Between Two Integers
import java.util.Scanner;
public class Java_48 {
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the lower Number:");
    int Low = Sc.nextInt();
    System.out.println("Enter the Higher Number:");
    int High = Sc.nextInt();
        while (Low < High) {
            if(checkPrimeNumber(Low))
                System.out.print(Low + " ");
            ++Low;
        }
    }
    public static boolean checkPrimeNumber(int num) {
        boolean flag = true;
        for(int i = 2; i <= num/2; ++i) {
            if(num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
/* Output
Enter the lower Number:
3
Enter the Higher Number:
15
3 5 7 11 13 
*/