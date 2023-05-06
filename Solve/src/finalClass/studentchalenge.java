package finalClass;

import java.lang.String; 
import java.lang.Runnable;

import java.util.*;
class student
{
	private static int count =1;
	private String rollNo;
	
	public student()
	{
		rollNo = generaterollNo();
	}
	
	private String generaterollNo()
	{
		Date d = new Date();
		
		String rn  = "Univ"+"-"+(d.getYear()+1900)+"-"+count;
		count++;
		return rn;
	}
	
	public String getrollNo()
	{
		return rollNo;
	}
}


public class studentchalenge {
	public static void main(String [] args)
	{
		student s1 = new student();
		student s2 = new student();
		String rollNo1 = s1.getrollNo();
		String rollNo2 = s2.getrollNo();
		
		System.out.println(rollNo1 + " "+ rollNo2);
		
	}

}
