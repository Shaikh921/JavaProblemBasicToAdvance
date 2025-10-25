// Example 145: Convert Array to LinkedList

import java.util.Arrays;
import java.util.LinkedList;

class java_145 {
  public static void main(String[] args) {
    String[] array = { "Java", "Python", "C" };
    System.out.println("Array: " + Arrays.toString(array));

    LinkedList<String> languages = new LinkedList<>(Arrays.asList(array));
    System.out.println("LinkedList: " + languages);
  }
}

/*
Output
Array: [Java, Python, C]
LinkedList: [Java, Python, C]
*/
