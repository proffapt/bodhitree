import java.time.*;
import java.util.*;
import java.time.format.*;
class Main{
	public static void main(String[] args){
		// Using Date class
		Date date = new Date();	
		System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
		// Using Calender class
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
		// Using time API
		LocalTime time = LocalTime.now();
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
		// System.out.println(time);
		String myTime = time.format(myFormat);
		System.out.println(myTime);
	}
}
