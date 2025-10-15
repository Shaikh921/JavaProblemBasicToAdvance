// Example 3: GCD for both positive and negative numbers
import java.util.Scanner;
public class Java_31 {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the Two Number :");
    int n1 = Sc.nextInt(); 
    int n2 = Sc.nextInt();
    // Always set to positive
    n1 = ( n1 > 0) ? n1 : -n1;
    n2 = ( n2 > 0) ? n2 : -n2;
    while(n1 != n2) {
      if(n1 > n2) {
        n1 -= n2;
      }
      else {
        n2 -= n1;
      }
    }
    System.out.println("GCD: " + n1);
  }
}
/* Output
Enter the Two Number :
-90
100
GCD: 10
*/