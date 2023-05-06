package ExceptionHandling;

import java.io.*;

class checkedEx
{
	//compiler doesn't allow to go forward if you didn't you try-catch block in
	//checked exception, you have to take care of it, Ex is shown below
	
	static void fun1()
	{
		try
		{
			FileInputStream f = new FileInputStream("my.txt");//have to import IO
			//class, as it is checked Exception, and in Explanation file I have
			//told that top 4 exception should be checked and this is one of them
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	static void fun2()
	{
		fun1();
	}
}

public class checked {
	public static void main(String[] args)
	{
		checkedEx.fun2();
	}

}
