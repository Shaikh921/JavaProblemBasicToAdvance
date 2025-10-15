import java.util.Scanner;
// Example 2: Swap two numbers without using temporary variable
public class Java_6 {
    public static void main(String[] args) {
        System.out.println("Enter the Numbers :");
        Scanner Sc = new Scanner(System.in);
        int first= Sc.nextInt();
        int second;
        second = Sc.nextInt();
        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        first = first - second;
        second = first + second;
        first = second - first;
        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
/* Output:
Enter the Numbers :         
5
10  
--Before swap--
First number = 5
Second number = 10
--After swap--
First number = 10
Second number = 5
*/