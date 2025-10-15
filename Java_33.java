// Example 2: Calculate LCM using GCD
import java.util.Scanner;
public class Java_33{
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the Two Number :");
    int n1 = Sc.nextInt(); 
    int n2 = Sc.nextInt();
    int gcd = 1;
    for(int i = 1; i <= n1 && i <= n2; ++i) {
      // Checks if i is factor of both integers
      if(n1 % i == 0 && n2 % i == 0)
        gcd = i;
    }
    int lcm = (n1 * n2) / gcd;
    System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
  }
}
/* Output
Enter the Two Number :
78
32
The LCM of 78 and 32 is 1248.
*/

