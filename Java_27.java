// Example 2: Display Fibonacci series using while loop
import  java.util.Scanner;
class Java_27 {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the Number :");
    int num = Sc.nextInt();
    int i = 1,  firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + num + " terms:");
    while (i <= num) {
      System.out.print(firstTerm + ", ");
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
      i++;
    }
  }
}
/* Output
Enter the Number :
10
Fibonacci Series till 10 terms:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 
*/