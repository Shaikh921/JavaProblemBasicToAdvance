// Example 2: Find GCD of two numbers using while loop and if else statement
import java.util.Scanner;
class Java_30 {
  public static void main(String[] args) {
   Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the Two Number :");
    int n1 = Sc.nextInt(); 
    int n2 = Sc.nextInt();
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
100
75
GCD: 25
*/