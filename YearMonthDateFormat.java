import java.io.*;
import java.time.*;
import  java.time.format.DateTimeFormatter;
public class YearMonthDateFormat {
    //yyyy-MM-dd Format ----------
    public static void main(String[] args) {
//        LocalDate date=LocalDate.now();
//        System.out.println(date);
//        //DD/MM/YY Format--------
        LocalDateTime date=LocalDateTime.now();
        DateTimeFormatter myDateFormat=DateTimeFormatter.ofPattern(" EEEE,dd MM yyyy");
        String formattedDate=date.format(myDateFormat);
        System.out.println(formattedDate);

    }
}
