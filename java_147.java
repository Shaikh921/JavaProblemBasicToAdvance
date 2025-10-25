// Example 147: Convert ArrayList to String Using join()

import java.util.ArrayList;

class java_147 {
  public static void main(String[] args) {
    ArrayList<String> languages = new ArrayList<>();

    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    System.out.println("ArrayList: " + languages);

    String arraylist = String.join(", ", languages);
    System.out.println("String: " + arraylist);
  }
}

/*
Output
ArrayList: [Java, Python, JavaScript]
String: Java, Python, JavaScript
*/
