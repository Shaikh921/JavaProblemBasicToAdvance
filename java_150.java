// Example 150: Iterate through ArrayList using for-each loop

import java.util.ArrayList;

class java_150 {
  public static void main(String[] args) {
    ArrayList<String> languages = new ArrayList<>();
    languages.add("Java");
    languages.add("JavaScript");
    languages.add("Python");
    System.out.println("ArrayList: " + languages);

    System.out.println("Iterating over ArrayList using for-each loop:");
    for (String language : languages) {
      System.out.print(language + ", ");
    }
  }
}

/*
Output
ArrayList: [Java, JavaScript, Python]
Iterating over ArrayList using for-each loop:
Java, JavaScript, Python, 
*/
