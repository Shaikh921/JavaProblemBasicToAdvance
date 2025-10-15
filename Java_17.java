// Example 2: Java Program to Check Alphabet using ternary operator
import java.util.Scanner;
public class Java_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);
        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + " is an alphabet."
                : c + " is not an alphabet.";
        System.out.println(output);
    }
}
/* Output
Enter a character: A
A is an alphabet.
*/