// Example 132: Implement the switch statement on Strings

class java_132 {
  public static void main(String[] args) {
    String language = "Java";

    switch (language) {
      case "Java":
        System.out.println(language + " is famous for enterprise applications.");
        break;
      case "JavaScript":
        System.out.println(language + " is famous for frontend and backend.");
        break;
      case "Python":
        System.out.println(language + " is famous for ML and AI.");
        break;
      default:
        System.out.println(language + " not found on record.");
        break;
    }
  }
}

/*
Output
Java is famous for enterprise applications.
*/
