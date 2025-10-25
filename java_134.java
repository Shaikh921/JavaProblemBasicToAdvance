// Example 134: Multiple Inheritance in Java

interface Backend {
  public void connectServer();
}

class Frontend {
  public void responsive(String str) {
    System.out.println(str + " can also be used as frontend.");
  }
}

class java_134 extends Frontend implements Backend {
  String language = "Java";

  public void connectServer() {
    System.out.println(language + " can be used as backend language.");
  }

  public static void main(String[] args) {
    java_134 java = new java_134();
    java.connectServer();
    java.responsive(java.language);
  }
}

/*
Output
Java can be used as backend language.
Java can also be used as frontend.
*/
