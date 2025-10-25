// Example 123: Java program to create custom checked exception

import java.util.ArrayList;
import java.util.Arrays;

class CustomException extends Exception {
  public CustomException(String message) {
    super(message);
  }
}

class java_123 {
  ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));

  public void checkLanguage(String language) throws CustomException {
    if (languages.contains(language)) {
      throw new CustomException(language + " already exists");
    } else {
      languages.add(language);
      System.out.println(language + " is added to the ArrayList");
    }
  }

  public static void main(String[] args) {
    java_123 obj = new java_123();
    try {
      obj.checkLanguage("Swift");
      obj.checkLanguage("Java");
    } catch (CustomException e) {
      System.out.println("[" + e + "] Exception Occurred");
    }
  }
}

/*
Output
Swift is added to the ArrayList
[java_123$CustomException: Java already exists] Exception Occurred
*/
