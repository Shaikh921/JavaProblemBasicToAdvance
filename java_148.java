// Example 148: Convert a String to ArrayList

import java.util.ArrayList;
import java.util.Arrays;

class java_148 {
  public static void main(String[] args) {
    String str = "Java, JavaScript, Python";
    System.out.println("String: " + str);

    String[] arr = str.split(",");
    ArrayList<String> languages = new ArrayList<>(Arrays.asList(arr));
    System.out.println("ArrayList: " + languages);
  }
}

/*
Output
String: Java, JavaScript, Python
ArrayList: [Java,  JavaScript,  Python]
*/
