// Example 3: Get Current Date time using predefined constants
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class java_83 {

    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
        String formatted = current.format(formatter);

        System.out.println("Current Date is: " + formatted);
    }
}
