// Example 129: Java program to make the first letter of a String capital

class java_129 {
  public static void main(String[] args) {
    String name = "programming";
    String firstLetter = name.substring(0, 1);
    String remainingLetters = name.substring(1, name.length());
    firstLetter = firstLetter.toUpperCase();
    name = firstLetter + remainingLetters;
    System.out.println("Name: " + name);
  }
}

/*
Output
Name: Programming
*/
