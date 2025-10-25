// Example 107: Java Program to Pass Method as Argument

class java_108 {
  public int add(int a, int b) {
    return a + b;
  }

  public void square(int num) {
    int result = num * num;
    System.out.println(result);
  }

  public static void main(String[] args) {
    java_108 obj = new java_108();
    obj.square(obj.add(15, 9));
  }
}
// Output:
// 576
