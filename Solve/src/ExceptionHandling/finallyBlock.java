package ExceptionHandling;
/*
 * * if you want to print message even if the exception is throwing then you have
 *   to use finally block.
 * * Finally block will be executed whatever may be the situation, evenn if the
 *   the throw and throws are used
 */

public class finallyBlock 
{
	public static void meth1() throws Exception
	{
		try
		{
			throw new Exception();
		}
		finally
		{
			System.out.println("finally block will execute");//first the finally
			//block will execute and then throws error in the output
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		meth1();
	}
}
