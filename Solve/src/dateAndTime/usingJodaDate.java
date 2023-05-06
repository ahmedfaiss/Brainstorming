package dateAndTime;

import java.util.*;
import java.time.*;
import java.time.temporal.*;

//This joda date is immutable but old Date class was mutable, In joda date it stores in seconds and nano Seconds, like n
//nano seconds will increase and
//when it reaches 1 second then second will increase by 1 and nano second will go to zero and starts again from 0 and increments till it becomes 1

class jodaDate
{
	public void method()
	{
		LocalDate ld = LocalDate.now();//gives date
		
		LocalDate ld1 = LocalDate.now(Clock.systemDefaultZone());//gives date same as above
		LocalDate ld2 = LocalDate.now(ZoneId.of("America/Los_Angeles"));
		
		System.out.println(ld);
		System.out.println(ld1);
		System.out.println(ld2);
		
		//we can also set time what ever we want
		
		LocalDate ld3 = LocalDate.of(2022, 11, 10);//gets the same data in the output
		
		System.out.println(ld3);
		
		//There is a method called epocday that has year 1970
		
		LocalDate ld4 = LocalDate.EPOCH;//gives value 1970-01-01
		System.out.println(ld4);
		
		LocalDate ld5 = LocalDate.ofEpochDay(730);//adds 2 year to the year 1970
		System.out.println(ld5);
		
		LocalDate ld6 = ld5.plusDays(365);//adds the 365 days to ld5, as this return an object so you have to define with new reference variable
		
		System.out.println(ld6);
	}
}

class jodaTime
{
	public void method()
	{
		LocalTime lt = LocalTime.now();
		System.out.println("\n This is LocalTime class \n\n");
		System.out.println(lt);//prints the current time with seconds and nano seconds
		
		LocalTime lt1 = LocalTime.now(Clock.systemDefaultZone());//same as above
		System.out.println(lt1);
		
		LocalTime lt2 = lt.minusHours(4);
		System.out.println(lt2);
	}
}

class jodaDateTime
{
	public void method()
	{
		
		System.out.println("\n This is LocalDateTime class \n\n");
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);//prints both date and time
		System.out.println(ldt.getDayOfMonth());//gets this day
		
		LocalDateTime ldt1 = ldt.minusMinutes(45);
		
		System.out.println(ldt1);
	}
}
public class usingJodaDate {
	public static void main(String[] args)
	{
		jodaDate jd = new jodaDate();
		jd.method();
		
		jodaTime jt = new jodaTime();
		jt.method();
		
		jodaDateTime jdt = new jodaDateTime();
		jdt.method();
	}

}
