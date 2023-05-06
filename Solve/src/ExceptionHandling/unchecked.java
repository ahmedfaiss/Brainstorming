package ExceptionHandling;

class uncheckedEx
{
    //This is unchecked because compiler is not giving error for diving by 0, it
	//allows, in unchecked either you can use try-catch block or leave as it is
	
	static void fun1()
	{
		try
		{
			int c = 10/0;
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage()+"\n");//inbuilt methods for Exception class
			e.printStackTrace();//this also a inbuilt method
			System.out.println("\n"+e);
		}
	}
	
	static void fun2()
	{
		fun1();
	}
	
}

public class unchecked {
	
	public static void main(String[] args)
	{
		uncheckedEx.fun2();
	}

}
