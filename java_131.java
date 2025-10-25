// Example 131: Java program to differentiate == and equals()

class java_131 {
  public static void main(String[] args) {
    String name1 = new String("Programming");
    String name2 = new String("Java");

    System.out.println("Check if two strings are equal");

    boolean result1 = (name1 == name2);
    System.out.println("Using == operator: " + result1);

    boolean result2 = name1.equals(name2);
    System.out.println("Using equals(): " + result2);
  }
}

/*
Output
Check if two strings are equal
Using == operator: false
Using equals(): false
*/
