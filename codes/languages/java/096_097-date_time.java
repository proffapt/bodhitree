// History
/*
	- Earlier the core classes were store in java.util.time.. 
	  but from jdk 8 onwards they are stored in java.time
	- Classes for both date and time are stored in java.time
*/

// JAVA is high!
/*
	You - Java, what's the time..
	Java - 192312391231
	You - WTF is that even?
	Java - It's the milliseconds passed since 1 January 1970.
	You - Fuck ok !, tell me the year passed since the beginning of earth.
	Java - 122
	You - wtaf, again.. it's wrong..
	Java - No for me the world started at 1900, do the maths now..
	You - Ok! I am done!
*/

import java.util.Date;
class Main{
	public static void main(String[] args){
		System.out.println(System.currentTimeMillis()); // the output is of type long
		System.out.println(Long.MAX_VALUE);
		// So basically yeah it is safe to store particular time in a variable of type long

		// The Date class[DEPRECATED]:
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getTime()); // same as that of previous one
		System.out.println(d.getDate());
		System.out.println(d.getSeconds()); // in milliseconds
		System.out.println(d.getYear()); // year - 1900
		// Been deprecated.. refer docs whenever you encounter it..
	}
}
