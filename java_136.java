// Example 136: Loop through enum using forEach loop

enum Size {
  SMALL, MEDIUM, LARGE, EXTRALARGE
}

class java_136 {
  public static void main(String[] args) {
    System.out.println("Access each enum constant:");
    for (Size size : Size.values()) {
      System.out.print(size + ", ");
    }
  }
}

/*
Output
Access each enum constant:
SMALL, MEDIUM, LARGE, EXTRALARGE, 
*/
