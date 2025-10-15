// Example 1: Java Program to Check Palindrome String
import java.util.Scanner;
class Java_44 {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the String. ");
    String str = Sc.next();
    String  reverseStr = "";
    int strLength = str.length();
    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }
    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(str + " is a Palindrome String.");
    }
    else {
      System.out.println(str + " is not a Palindrome String.");
    }
  }
}

/* Output
Enter the String. 
Radar
Radar is a Palindrome String.
*/