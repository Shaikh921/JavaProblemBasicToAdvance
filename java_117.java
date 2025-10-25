// Example 117: Java Program to Delete a Non-Empty Directory

import java.io.File;

class java_117 {
  public static void main(String[] args) {
    try {
      File directory = new File("Directory");
      File[] files = directory.listFiles();
      if (files != null) {
        for (File file : files) {
          System.out.println(file + " deleted.");
          file.delete();
        }
      }
      if (directory.delete()) {
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
Directory\file1.txt deleted.
Directory\file2.txt deleted.
Directory Deleted
*/
