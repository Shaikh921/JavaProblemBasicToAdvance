// Example 110: Java Program to Convert InputStream to Byte Array

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

class java_111 {
  public static void main(String args[]) {
    try {
      byte[] input = { 1, 2, 3, 4 };
      InputStream stream = new ByteArrayInputStream(input);
      System.out.println("Input Stream: " + stream);
      byte[] array = stream.readAllBytes();
      System.out.println("Byte Array: " + Arrays.toString(array));
      stream.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
// Output Example:
// Input Stream: java.io.ByteArrayInputStream@<hash>
// Byte Array: [1, 2, 3, 4]