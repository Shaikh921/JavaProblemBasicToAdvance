// Example 118: Get File Name from Absolute Path using getName()

import java.io.File;

class java_118 {
  public static void main(String[] args) {
    File file = new File("File path\\Test.class");
    String fileName = file.getName();
    System.out.println("File Name: " + fileName);
  }
}

/*
Output
File Name: Test.class
*/
