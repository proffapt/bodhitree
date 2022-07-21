// java.util.Calendar is an abstract class.. can't be instantiated traditionally!
import java.util.Calendar;
import java.util.TimeZone;
import java.util.GregorianCalendar;
// Gregorian Calendar class is a concrete class.. can be instantiated traditionally.
class Main{
	public static void main(String[] args){
		Calendar c = Calendar.getInstance(); // tho being the abstract class there is a method inside it which can give an instance to it	
		System.out.println("The calendar type is: "+c.getCalendarType());
		System.out.println("The time zone is: "+c.getTimeZone());
		System.out.println("The time zone ID is: "+c.getTimeZone().getID());
		System.out.println(c.getTime());
		System.out.println(c.getTime());
		System.out.println(c.getTime());
		System.out.println(c.getTime());
		System.out.println(c.getTime());
		System.out.println(c.getTime());
		System.out.println(c.getTime());
		System.out.println(c.getTime());
		// System.out.println(c.getDate()); --> method was for Date class!

		Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore")); // TimeZone's constructor is the id of timezone..
		System.out.println("The time zone is: "+c1.getTimeZone());
		System.out.println("The time zone ID is: "+c1.getTimeZone().getID());
		System.out.println(c1.getTime());
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.YEAR));
		// have methods like before(), after() etc with obvious meanings..
		// GregorianCalendar class
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println(cal.isLeapYear(2020));
		System.out.println(cal.isLeapYear(2019));
		// TimeZone
		/*
		for(String i:TimeZone.getAvailableIDs())
			System.out.print(i+" ");
		*/
		System.out.println(TimeZone.getAvailableIDs()[0]);
		System.out.println(TimeZone.getAvailableIDs()[10]);
		System.out.println(TimeZone.getAvailableIDs()[100]);
		System.out.println(TimeZone.getDefault());
	}
}
