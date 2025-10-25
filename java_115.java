// Example 115: Java Program to Delete a File using delete()

import java.io.File;

class java_115 {
  public static void main(String[] args) {
    File file = new File("JavaFile.java");
    boolean value = file.delete();
    if (value) {
      System.out.println("JavaFile.java is successfully deleted.");
    } else {
      System.out.println("File doesn't exist.");
    }
  }
}

/*
Output
JavaFile.java is successfully deleted.
*/
