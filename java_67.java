// Example 1: Convert String to Date using predefined formatters
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class java_67 {

    public static void main(String[] args) {
        // Format y-M-d or yyyy-MM-d
        String string = "2017-07-25";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

        System.out.println(date);
    }
}
