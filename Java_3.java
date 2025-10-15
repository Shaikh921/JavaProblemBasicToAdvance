import java.util.Scanner;
// Example: Find ASCII value of a character
public class Java_3 {
    public static void main(String[] args) {
        System.out.println("Enter the Character: ");
        Scanner Sc = new Scanner(System.in);
        char ch = Sc.next().charAt(0);
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;
        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}
/* Output:
Enter the Character:
A
The ASCII value of A is: 65
The ASCII value of A is: 65
*/  