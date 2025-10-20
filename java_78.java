// Example 3: Check if an array contains a given value for non-primitive types
import java.util.Arrays;

class java_78 {
  public static void main(String[] args){

    String[] strings = {"One","Two","Three","Four","Five"};
    String toFind= "Four";

    boolean found = Arrays.stream(strings).anyMatch(t -> t.equals(toFind));

    if(found)
      System.out.println(toFind + " is found.");
    else
      System.out.println(toFind + " is not found.");
  }
}
