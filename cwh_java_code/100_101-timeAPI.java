// NEED FOR NEW ITERATION OF TIME API
/*
	Date and Calendar classes became too hectic to manage
	so many things.. 
	Like khichdi ban gayi thi for real.. toh unn sabko re-arrange karne ke liye for a greater cause this came into existence.

	And yeah hell level of upgradation.. like can now store upto NONO-SECONDS!
*/
import java.time.*;
import java.time.format.*; // for DateTimeFormatter
class Main{
	// Some very important calsses of java.time will be demonstrated in here
	public static void main(String[] args){
		// This time the date objects are immutable.. like why the hell will you want a feature to change date.. for bugs? duhh..
		// Locat date.. contains only date
		LocalDate d = LocalDate.now(); // abstract classes instantiated with help of a method inside it..
		System.out.println("Today's date is: "+d);
		System.out.println("Yesterday's date was: "+d.minusDays(1));
		System.out.println("Tomorrow's date is: "+d.plusDays(1));
		// Local Time.. contains only time
		LocalTime t = LocalTime.now();
		System.out.println("Current time is: "+t);
		System.out.println("Time 1 hour back was: "+t.minusHours(1));
		System.out.println("Time 1 hour later will be: "+t.plusHours(1));
		// Local date time.. contains both date and time
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		// DateTimeFormatter.. 
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // ********> Yes the case of DD-MM-YYYY matters!!
		System.out.println(df);
		String myDate = dt.format(df);
		System.out.println(myDate);
		DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
		String myDate2 = dt.format(df2);
		System.out.println(myDate2);
		DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E"); // ********> Yes the case of DD-MM-YYYY matters!!
		String myDate3 = dt.format(df3);
		System.out.println(myDate3);
		DateTimeFormatter df4 = DateTimeFormatter.ofPattern("E | dd/MM/yyyy | h:m a"); // ********> Yes the case of DD-MM-YYYY matters!!
		String myDate4 = dt.format(df4);
		System.out.println(myDate4);
	}
}
