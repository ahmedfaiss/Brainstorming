package ExceptionHandling;
//If not handling exception then throw it, and also you can handle while throwing
//exception
class userException extends Exception//user defined class 
{
	public String toString()
	{
		return "Dimension shouldn't be negative";
	}
}

class throwThrowsEx
{
	public int dimension(int l, int b) throws userException//here throws is like
	//giving in advance warning that this throws exception and using the keyword
	//"throw" to throw the Exception
	{
		if(l<0 || b<0)
		{
			throw new userException();//throwing user defined exception, this is
			//like saying that it should through this exception and should be 
			//handled in calling methods and it checks with calling method whether
			//they have written or not or else it wont allow to compile the program

		}
		else
		{
			return l*b;
		}
	}
}

public class throwAndthrows {
	public static void main(String[] args) {
		try
		{
			throwThrowsEx t = new throwThrowsEx();
			int r = t.dimension(5,-5);
		}
		catch(userException e)
		{
			System.out.println(e);
		}
		//If you don't write try-catch block in any of the calling method of a 
		//throw exception then it will throw error while writing program itself
		// if you write throws in every calling method than error will vanish,
		//i,e you will allowed to compile and error will be thrown in run time
		
	}

}
