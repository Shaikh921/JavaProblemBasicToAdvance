// Example 2: Convert char array to String
// If you have a char array instead of just a char, we can easily convert it to String using String methods as follows:

public class java_74 {

    public static void main(String[] args) {
        char[] ch = {'a', 'e', 'i', 'o', 'u'};
        String st = String.valueOf(ch);
        String st2 = new String(ch);
        System.out.println(st);
        System.out.println(st2);
    }
}
