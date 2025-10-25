// Example 1: Java program to call one constructor from another
class java_105 {

  int sum;
  java_105() {
    this(5, 2);
  }
  java_105(int arg1, int arg2) {
    this.sum = arg1 + arg2;
  }

  void display() {
    System.out.println("Sum is: " + sum);
  }
  public static void main(String[] args) {
    java_105 obj = new java_105();
    obj.display();
  }
}
/*output
Sum is: 7
*/