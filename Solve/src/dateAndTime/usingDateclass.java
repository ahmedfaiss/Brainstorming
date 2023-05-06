package dateAndTime;
import java.util.Date;
import java.lang.annotation.*;

//Date class is deprecated, java has now created a new class Date.time

class date
{
	public void method()
	{
		Date d = new Date();
		System.out.println(System.currentTimeMillis());//this is gives a long value that is counting the milliseconds from starting year 1970
		
		System.out.println(System.currentTimeMillis()/1000/60/60/24/365);//this gives total year starting from 1970 that will be 52 till 2022
		System.out.println(System.currentTimeMillis()/1000/60/60/24);//gives total month
		System.out.println(System.currentTimeMillis()/1000/60/60);//gives total day
		System.out.println(System.currentTimeMillis()/1000/60);//gives total hour and then if we remove another 60 it will give total minutes and
		//then seconds
		@SuppressWarnings("Unchecked")
		Date d1 = new Date("11/2/2022");
		
		System.out.println(d);//this gives day date time of that given date
		System.out.println(d.getDate());//gives current date
		System.out.println(d1.getDay());//gives day in this week, starting from sunday that is 0 to tuesday - 2, In java everything starts from 0,
		//even the month
		
		System.out.println(d1.getYear()+1900);//give 122 starting from 1900 and then if you want to get current year then add 1900, because in java 
		//year starts from 1900
		
	}
}

public class usingDateclass {
	public static void main (String[] args)
	{
		date d = new date();
		d.method();
	}

}
