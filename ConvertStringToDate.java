import java.time.LocalDate;
import  java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ConvertStringToDate {
    public static void main(String[] args) {
        String str="July 25,2017";
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMMM d ,yyyy",Locale.ENGLISH);
        LocalDate date=LocalDate.parse(str,formatter);
        System.out.println(date);
    }
}
