// Example 116: Java Program to delete an empty directory

import java.io.File;

class java_116 {
  public static void main(String[] args) {
    try {
      File directory = new File("Directory");
      boolean result = directory.delete();
      if (result) {
        System.out.println("Directory Deleted");
      } else {
        System.out.println("Directory not Found");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

/*
Output
Directory Deleted
*/
