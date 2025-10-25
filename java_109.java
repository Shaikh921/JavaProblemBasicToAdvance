// Example 108: Java Program to calculate the method execution time


class java_109 {
  public void display() {
    System.out.println("Calculating Method execution time:");
  }

  public static void main(String[] args) {
    java_109 obj = new java_109();
    long start = System.nanoTime();
    obj.display();
    long end = System.nanoTime();
    long execution = end - start;
    System.out.println("Execution time: " + execution + " nanoseconds");
  }
}
// Output Example:
// Calculating Method execution time:
// Execution time: <some number> nanoseconds