import java.util.Date;
import java.text.SimpleDateFormat;
public class DateAndTimeProgram {
    public static void main(String[] args) {
        //Getting the Current Date and Time----->
        Date date = new Date();
        //ste format  in 12 hrs
        SimpleDateFormat formatTime=new SimpleDateFormat("hh.mm aa");
        //hh =hours in 12hr format
        //mm =minute
        //aa =am/pm
       String time = formatTime.format(date); //Changing the format of 'date
        //Display time as per format
        System.out.println("Current time in AM/PM Format is : "+time);
    }
}
