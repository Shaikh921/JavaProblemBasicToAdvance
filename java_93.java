// Example 2: Get the current working directory using Path
import java.nio.file.Paths;

public class java_93 {

    public static void main(String[] args) {

        String path = Paths.get("").toAbsolutePath().toString();
        System.out.println("Working Directory = " + path);

    }
}
