// Example 146: Convert the ArrayList into a String

import java.util.ArrayList;

class java_146 {
  public static void main(String[] args) {
    ArrayList<String> languages = new ArrayList<>();

    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    System.out.println("ArrayList: " + languages);

    String arraylist = languages.toString();
    System.out.println("String: " + arraylist);
  }
}

/*
Output
ArrayList: [Java, Python, JavaScript]
String: [Java, Python, JavaScript]
*/
