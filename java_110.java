// Example 109: Java Program to convert String to InputStream

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

class java_110 {
  public static void main(String args[]) {
    String name = "Talent Battle";
    System.out.println("String is: " + name);
    try {
      InputStream stream = new ByteArrayInputStream(name.getBytes(StandardCharsets.UTF_8));
      System.out.println("InputStream: " + stream);
      System.out.println("Available bytes at the beginning: " + stream.available());
      stream.read();
      stream.read();
      stream.read();
      System.out.println("Available bytes at the end: " + stream.available());
      stream.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
// Output Example:
// String is: Talent Battle
// InputStream: java.io.ByteArrayInputStream@<hash>
// Available bytes at the beginning: 13
// Available bytes at the end: 10