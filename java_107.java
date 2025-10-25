// Example 1: Define lambda expressions as method parameters
import java.util.ArrayList;

class java_107 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("java");
        languages.add("swift");
        languages.add("python");
        System.out.println("ArrayList: " + languages);
        languages.replaceAll(e -> e.toUpperCase());
        System.out.println("Updated ArrayList: " + languages);
    }
}
/*output
ArrayList: [java, swift, python]
Updated ArrayList: [JAVA, SWIFT, PYTHON]
*/