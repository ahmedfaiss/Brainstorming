package dateAndTime;
import java.util.GregorianCalendar;
import java.util.TimeZone;

class Calendar
{
	public void method()
	{
		GregorianCalendar gc = new GregorianCalendar();//There are many calendars available in the world So java uses GregorianCalendatr
		
		System.out.println(gc.getFirstDayOfWeek());//Prints first day of a week -> 1 -> that is Sunday
		System.out.println(gc.getTime());//gives day month date time DisplayName year
		
		TimeZone tz = gc.getTimeZone();//we have to use TimeZone by using as gc
		
		gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));//setting calendar as America/Los_Angeles
		
		TimeZone tz1 = gc.getTimeZone();//gets America/Los_Angeles time zone as we have set that using gc
		
		System.out.println(tz1.getDisplayName());//Gives output as IST
		
	
		
		
		
	}
}


public class usingGregorianCalendar {
	public static void main(String[] args)
	{
		Calendar c = new Calendar();
		c.method();
	}

}
