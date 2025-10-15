// Example 2: Java Program to Check Palindrome Number
import java.util.Scanner;
class Java_45 {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the Number:");
    int Number = Sc.nextInt();
    int Reverse = 0, remainder;
    int OrgNum = Number;
    while (Number != 0) {
      remainder = Number % 10;
      Reverse = Reverse * 10 + remainder;
      Number /= 10;
   }
    // check if Reverse and OrgNum are equal
    if (OrgNum == Reverse) {
      System.out.println(OrgNum + " is Palindrome.");
    }
    else {
      System.out.println(OrgNum + " is not Palindrome.");
    }
  }
}
/* Output
Enter the Number:
11211
11211 is Palindrome.
*/