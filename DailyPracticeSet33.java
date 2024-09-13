import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DailyPracticeSet33 {
    public static void main(String[] args) {
        LocalDateTime current =LocalDateTime.now();
        System.out.println("Current Date and Time..."+ current);
        DateTimeFormatter formate=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatter=current.format(formate);
        System.out.println(formatter);
   }
}
