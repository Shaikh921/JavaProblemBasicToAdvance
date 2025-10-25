// Example 114: Java Program to Read File Using BufferedInputStream

import java.io.BufferedInputStream;
import java.io.FileInputStream;

class java_114 {
  public static void main(String[] args) {
    try {
      FileInputStream file = new FileInputStream("input.txt");
      BufferedInputStream input = new BufferedInputStream(file);
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
This is a content of the file input.txt
*/
