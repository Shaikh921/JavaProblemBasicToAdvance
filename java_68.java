// Example 2: Convert String to Date using pattern formatters
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class java_68 {

    public static void main(String[] args) {
        String string = "July 25, 2017";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);

        System.out.println(date);
    }
}
