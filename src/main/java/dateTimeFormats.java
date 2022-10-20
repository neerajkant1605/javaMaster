
import java.sql.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class dateTimeFormats {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse("2019-03-27 10:15:30", formatter);
        System.out.println(dateTime);
    }
}
