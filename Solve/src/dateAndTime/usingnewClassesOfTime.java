package dateAndTime;
import java.util.*;
import java.time.*;
import java.time.temporal.Temporal;


class classesOfTime
{
	public void method()
	{
		ZonedDateTime zdt = ZonedDateTime.now();//gives every informations like date time offset ZoneId
		System.out.println(zdt);
		
		System.out.println("\n this is using OffsetDateTime \n");
		OffsetDateTime odt = OffsetDateTime.now();//will have information about Offset date and time but not ZoneId
		System.out.println(odt);
		
		System.out.println("\n this is using OffsetTime \n");
		OffsetTime ot = OffsetTime.now();//will have information about Offset and time
		System.out.println(ot);
		
		System.out.println("\n this is using zoneId \n");
		ZoneId zi = ZoneId.of("Asia/Kolkata");//will have only info about Asia/Kolkata
		System.out.println(zi);
		
		ZonedDateTime zdt1 = ZonedDateTime.now(zi);
		System.out.println(zdt1);
		
		System.out.println("\n this is using MonthDay \n");
		MonthDay md = MonthDay.now();//contains only month and date
		System.out.println(md);
		
		System.out.println("\n this is using yearMonth \n");
		YearMonth ym = YearMonth.now();
		System.out.println(ym);
		
		System.out.println("\n this is using year \n");
		Year y = Year.now();
		System.out.println(y);
		
		System.out.println("\n this is using Period \n");
		Period p = Period.of(2, 2, 2);
		Temporal p1 = p.addTo(LocalDate.now());
		System.out.println(p1);
		
		System.out.println("\n this is using Instant \n");
		Instant i = Instant.ofEpochSecond(1000);//gives year from 1970 and add 1000 second to the time
		System.out.println(i);
		
		
		
	}
}

public class usingnewClassesOfTime {
	public static void main(String[] args)
	{
		classesOfTime cot = new classesOfTime();
		cot.method();
		
	}

}
