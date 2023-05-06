package dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

//y=year, M=Month, d=day
//h=hour(0-12), H=Hour(0-23), m=minute, s=seconds, S=milliSeconds, z=time zone, Z=Offset

//date formatter is available in java.time.format.DateFormater

class formatter
{
	public void method()
	{
		LocalDateTime ld = LocalDateTime.now();
		
		System.out.println("\n this is using LocalDateTime\n");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss");//you can also change the / to -
		System.out.println(df.format(ld));//you are formatting the ld to df
		
		System.out.println("\n this is using ZonedDateTime\n");
		ZonedDateTime zdt = ZonedDateTime.now();
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss z");//you cant print zoneId with LocalDatetime you have to use ZonedDateTime
		System.out.println(df1.format(zdt));
	}
}

public class usingDateFormatter {
	public static void main(String[] args) {
		formatter f = new formatter();
		f.method();
	}

}
