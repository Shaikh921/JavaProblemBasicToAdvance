// Example 2: Take string from users and remove the white space
import java.util.Scanner;

class java_63 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");

    String input = sc.nextLine();
    System.out.println("Original String: " + input);
    input = input.replaceAll("\\s", "");
    System.out.println("Final String: " + input);
    sc.close();
  }
}
