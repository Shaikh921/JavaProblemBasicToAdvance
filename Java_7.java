import java.util.Scanner;
// Example 3: Check if a number is even or odd
public class Java_7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
/* Output:
Enter a number: 7           
7 is odd
*/

