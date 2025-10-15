// How to Print an Integer entered by an user
import java.util.Scanner;
public class Java_0 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = reader.nextInt();
        System.out.println("You entered: " + number);
    }
}

/* Output:
Enter a number: 5
You entered: 5
*/
