/*Example 3: Convert String to char array
We can also convert a string to char array (but not char) using String's method toCharArray().*/

import java.util.Arrays;

public class java_75 {

    public static void main(String[] args) {
        String st = "This is great";

        char[] chars = st.toCharArray();
        System.out.println(Arrays.toString(chars));
    }
}
