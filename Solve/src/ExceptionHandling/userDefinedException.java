package ExceptionHandling;

class lowBalanceException extends Exception //should inherit mother class exception
{
	public void display()
	{
		System.out.println("The amount should be more than 500");
	}
	
	public String toString()
	{
		return "The amount should be more than 500";
	}
}

class callingUserDefinedException
{
	public void message()
	{
		try
		{
			throw new lowBalanceException();//either you write throws in the 
			//head of the method and you don't have to write try-catch block here,
			//it is of no use to write throw here and also write a try-catch block
			//here itself, what throw actually used when we want to throw error
			//message to the calling method and telling to handle it in calling
			//method, Ex you can see in throwAndthrows (i,e separate class) in
			//this package
		}
		catch(lowBalanceException e)
		{
			e.display();//either you can use this
			System.out.println(e);//or you can use only e, it will call to String() method
		}
	}
}

public class userDefinedException {
	public static void main(String[] args)
	{
		callingUserDefinedException e = new callingUserDefinedException();
		e.message();
	}

}
