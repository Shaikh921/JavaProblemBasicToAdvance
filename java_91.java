// Example 2: Convert Array to ArrayList
import java.util.ArrayList;
import java.util.Arrays;

class java_91 {
  public static void main(String[] args) {

    // create an array
    String[] array = {"Java", "Python", "C"};
    System.out.println("Array: " + Arrays.toString(array));

    // convert array to arraylist
    ArrayList<String> languages= new ArrayList<>(Arrays.asList(array));

    System.out.println("ArrayList: " + languages);

  }
}
