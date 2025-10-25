// Example 133: Calculate Simple Interest in Java

import java.util.Scanner;

class java_133 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the principal: ");
    double principal = input.nextDouble();

    System.out.print("Enter the rate: ");
    double rate = input.nextDouble();

    System.out.print("Enter the time: ");
    double time = input.nextDouble();

    double interest = (principal * time * rate) / 100;

    System.out.println("Principal: " + principal);
    System.out.println("Interest Rate: " + rate);
    System.out.println("Time Duration: " + time);
    System.out.println("Simple Interest: " + interest);

    input.close();
  }
}

/*
Output
Enter the principal: 1000
Enter the rate: 5
Enter the time: 2
Principal: 1000.0
Interest Rate: 5.0
Time Duration: 2.0
Simple Interest: 100.0
*/
