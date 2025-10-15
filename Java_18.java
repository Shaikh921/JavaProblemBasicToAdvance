
// Example 3: Java Program to Check Alphabet using isAlphabetic() Method
import java.util.Scanner;
class Java_18 {
  public static void main(String[] args) {
      System.out.println("Enter the Alphabet :");
    Scanner Sc = new Scanner(System.in);
    char c = Sc.next().charAt(0);
    if (Character.isAlphabetic(c)) {
      System.out.println(c + " is an alphabet.");
    }
    else {
      System.out.println(c + " is not an alphabet.");
    }
  }
}

/* Output
Enter the Alphabet :
K
K is an alphabet.
*/