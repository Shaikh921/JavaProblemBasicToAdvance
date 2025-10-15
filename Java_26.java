// Example: Display Fibonacci Series Using for Loop
import java.util.Scanner;
class Java_26 {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the Number :");
    int num = Sc.nextInt();
    int firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + num + " terms:");
    for (int i = 1; i <= num; ++i) {
      System.out.print(firstTerm + ", ");
      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}

/* Output
Enter the Number :
10
Fibonacci Series till 10 terms:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 
*/
