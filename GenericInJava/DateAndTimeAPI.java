package GenericInJava;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeAPI {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time =LocalTime.now();
		System.out.println(time);
		
		int day =date.getDayOfMonth();
		int month =date.getMonthValue();
		int year =date.getYear();
		System.out.println(day+"/"+month+"/"+year);
		
		int hrs =time.getHour();
		int min =time.getMinute();
		int sec=time.getSecond();
		int nano=time.getNano();
		System.out.println(hrs +":"+min+":"+sec+":"+nano);
	}

}
