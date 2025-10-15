// Example 2: Find the largest number among three using nested if..else statement
import java.util.Scanner;
public class Java_12 {
    public static void main(String[] args) {
        System.out.println("Enter the Numbers :");
        Scanner Sc = new Scanner(System.in);
        int first= Sc.nextInt();
        int second= Sc.nextInt();
        int third= Sc.nextInt();
        if(first >= second) {
            if(first >= third)
                System.out.println(first + " is the largest number.");
            else
                System.out.println(third + " is the largest number.");
        } else {
            if(second >= third)
                System.out.println(second + " is the largest number.");
            else
                System.out.println(third + " is the largest number.");
        }
    }
}
/* Output:
Enter the Numbers :
5
15
10
15 is the largest number.
*/