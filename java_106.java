// Example 1: Java program to create a private constructor
class Test {
  private Test () {
    System.out.println("This is a private constructor.");
  }
  public static void instanceMethod() {
    Test obj = new Test();
  }

}

class java_106 {

  public static void main(String[] args) {
    Test.instanceMethod();
  }
}
/*Output
This is a private constructor.
*/