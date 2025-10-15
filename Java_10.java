// Example 2: Check whether an alphabet is vowel or consonant using switch statement
import java.util.Scanner;
public class Java_10 {
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        ch = scanner.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}
/* Output:
Enter an alphabet: o
o is vowel
*/

