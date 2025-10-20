// Example 2: Milliseconds to Seconds/Minutes Using Mathematical Formula
class java_86 {
  public static void main(String[] args) {
    
    long milliseconds = 1000000;

    long seconds = (milliseconds / 1000);
    System.out.println(milliseconds + " Milliseconds = " + seconds + " Seconds");

    long minutes = (milliseconds / 1000) / 60;
    System.out.println(milliseconds + " Milliseconds = " + minutes + " Minutes");
  }
}
