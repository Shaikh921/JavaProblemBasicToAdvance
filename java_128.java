// Example 128: Java program to clear StringBuffer using delete()

class java_128 {
  public static void main(String[] args) {
    StringBuffer str = new StringBuffer();
    str.append("Java");
    str.append(" is");
    str.append(" popular.");
    System.out.println("StringBuffer: " + str);
    str.delete(0, str.length());
    System.out.println("Updated StringBuffer: " + str);
  }
}

/*
Output
StringBuffer: Java is popular.
Updated StringBuffer: 
*/
