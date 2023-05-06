package multithreading;

public class usingRunnableInterface implements Runnable //you have to override 
//the run() method and only one method is available in runnable interface
{
	public void run()
	{
		for(int i = 0 ; i < 1000 ; i++)
		{
			
			System.out.println("Ahmed");
		}
	}
	
	public static void main(String[] args)
	{
		usingRunnableInterface ri = new usingRunnableInterface();
		
		Thread m = new Thread(ri);//This has to be written because Runnable
		//interface doesn't have ability to run run() method so we have to 
		//specify the class to thread class and that thread class reference
		//will run the method
		
		m.start();
		
		for(int i = 0 ; i < 1000 ; i++)
		{
			
			System.out.println("Ahmed");
		}
		
		//we can also write using different class as threadClass.java

	}
}
