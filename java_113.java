// Example 113: Java Program to Create a File

import java.io.File;

class java_113 {
  public static void main(String[] args) {
    File file = new File("JavaFile.java");
    try {
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("New Java File is created.");
      } else {
        System.out.println("The file already exists.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

/*
Output
New Java File is created.
*/
