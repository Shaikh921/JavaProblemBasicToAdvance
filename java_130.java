// Example 130: Loop through each character of a string using for loop

class java_130 {
  public static void main(String[] args) {
    String name = "Programming";
    System.out.println("Characters in " + name + " are:");
    for (int i = 0; i < name.length(); i++) {
      char a = name.charAt(i);
      System.out.print(a + ", ");
    }
  }
}

/*
Output
Characters in Programming are:
P, r, o, g, r, a, m, m, i, n, g, 
*/
