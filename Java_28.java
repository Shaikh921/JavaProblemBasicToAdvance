// Example 3: Display Fibonacci series up to a given number
import  java.util.Scanner;
class Java_28 {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the Number :");
    int num = Sc.nextInt();
    int  firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series Upto " + num + ": ");
    while (firstTerm <= num) {
      System.out.print(firstTerm + ", ");
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}
/* Output
Enter the Number :
56
Fibonacci Series Upto 56: 
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 
*/