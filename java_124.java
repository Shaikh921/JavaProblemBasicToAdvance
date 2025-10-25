// Example 124: Java program to create an immutable class

final class Immutable {
  private String name;
  private int date;

  Immutable(String name, int date) {
    this.name = name;
    this.date = date;
  }

  public String getName() {
    return name;
  }

  public int getDate() {
    return date;
  }
}

class java_124 {
  public static void main(String[] args) {
    Immutable obj = new Immutable("Talent Battle", 2011);
    System.out.println("Name: " + obj.getName());
    System.out.println("Date: " + obj.getDate());
  }
}

/*
Output
Name: Talent Battle
Date: 2011
*/
