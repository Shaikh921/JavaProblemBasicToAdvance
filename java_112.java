// Example 112: Java Program to Load a Text File as InputStream

import java.io.FileInputStream;
import java.io.InputStream;

class java_112 {
  public static void main(String args[]) {
    try {
      InputStream input = new FileInputStream("input.txt");
      System.out.println("Data in the file: ");
      int i = input.read();
      while (i != -1) {
        System.out.print((char) i);
        i = input.read();
      }
      input.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

/*
Output
Data in the file:
This is a content of the file input.txt
*/
