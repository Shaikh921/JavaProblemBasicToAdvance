// Example 1: Find Largest Among three numbers using if..else statement
import java.util.Scanner;
public class Java_11 {
    public static void main(String[] args) {
        System.out.println("Enter the Numbers :");
        Scanner Sc = new Scanner(System.in);
        int first= Sc.nextInt();
        int second= Sc.nextInt();
        int third= Sc.nextInt();
        if( first >= second && first >= third)
            System.out.println(first + " is the largest number.");
       else if (second >= first && second >= third)
            System.out.println(second + " is the largest number.");
        else
            System.out.println(third + " is the largest number.");
   }
}
/* Output:
Enter the Numbers :
5
10
15
15 is the largest number.
*/
