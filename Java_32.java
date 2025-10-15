// Example 1: LCM using while Loop and if Statement
import java.util.Scanner;
public class Java_32 {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the Two Number :");
    int n1 = Sc.nextInt(); 
    int n2 = Sc.nextInt();
   int  lcm;
   // maximum number between n1 and n2 is stored in lcm
    lcm = (n1 > n2) ? n1 : n2;
    // Always true
    while(true) {
      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
        break;
      }
      ++lcm;
    }
  }
}
/* Output
Enter the Two Number :
72
120
The LCM of 72 and 120 is 360.
*/