// Example 1: Find GCD of two numbers using for loop and if statement
import java.util.Scanner;
class Java_29 {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println(".Enter the Two Number :");
    int n1 = Sc.nextInt(); 
    int n2 = Sc.nextInt();
    int gcd = 1;
    for (int i = 1; i <= n1 && i <= n2; ++i) {
      if (n1 % i == 0 && n2 % i == 0)
        gcd = i;
    }
    System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
  }
}

/* Output
Enter the Two Number :
12
10
GCD of 12 and 10 is 2
*/