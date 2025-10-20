// Example 1: Milliseconds to Seconds/Minutes Using toMinutes() and toSeconds()
import java.util.concurrent.TimeUnit;

class java_85{
  public static void main(String[] args) {

    long milliseconds = 1000000;

    // us of toSeconds()
    // to convert milliseconds to minutes
    long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
    System.out.println(milliseconds + " Milliseconds = " + seconds + " Seconds");

    // use of toMinutes()
    // to convert milliseconds to minutes
    long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds);
    System.out.println(milliseconds + " Milliseconds = " + minutes + " Minutes");
  }
}
