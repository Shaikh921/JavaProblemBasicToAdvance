// Example: Java Program to Find Roots of a Quadratic Equation
import java.util.Scanner;
public class Java_13 {
  public static void main(String[] args) {
    System.out.println("Enter the coefficients a, b and c:");
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double root1, root2;
    double determinant = b * b - 4 * a * c;
    if (determinant > 0) {
      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
      root2 = (-b - Math.sqrt(determinant)) / (2 * a);
      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
    }
    else if (determinant == 0) {
      root1 = root2 = -b / (2 * a);
      System.out.format("root1 = root2 = %.2f;", root1);
    }
    else {
      double real = -b / (2 * a);
      double imaginary = Math.sqrt(-determinant) / (2 * a);
      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
    }
  }
}
/* Output:
Enter the coefficients a, b and c:
1
-7
12
