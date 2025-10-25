// Example 149: Iterate through ArrayList using for loop

import java.util.ArrayList;

class java_149 {
  public static void main(String[] args) {
    ArrayList<String> languages = new ArrayList<>();
    languages.add("Java");
    languages.add("JavaScript");
    languages.add("Python");
    System.out.println("ArrayList: " + languages);

    System.out.println("Iterating over ArrayList using for loop:");
    for (int i = 0; i < languages.size(); i++) {
      System.out.print(languages.get(i) + ", ");
    }
  }
}

/*
Output
ArrayList: [Java, JavaScript, Python]
Iterating over ArrayList using for loop:
Java, JavaScript, Python, 
*/
