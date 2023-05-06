package multithreading;

class myThread extends Thread
{
	public void run()
	{
		for(int i = 0 ; i < 5000 ; i++)
		{
			System.out.println("HEY");
		}
	}
}

public class daemonYieldJoin {
	
	public static void main(String[] args)
	{
		myThread m = new myThread();
		//m.start();//till the myThread finishes, the main method automatically 
		//waits to terminate But if you want to terminate main Method without 
		//waiting for myThread class to finish then you have to use setdaemon method
	
		m.setDaemon(true);//this terminates as soon the main method finishes the
		//work, it doesn't wait for other thread to complete its task
		m.start();//you can see the output, it will  be only once 'HEY' then stops
		//So if you want to wait then you have to use join method
		Thread j = Thread.currentThread();//you have to use this, to make use of join
		//or you can use directly by using m
		//currentThread() gives reference of main Thread
		try{
			m.join();//It will wait for all the Thread to complete
		}
		catch(Exception e)
		{
			
		}
		//So even after using daemon method it is not terminating the thread, it waits
		//If you want to give other Thread more time then you have to use yield method
		for(int i = 0 ; i < 5000 ; i++)
		{
			System.out.println("HEYHEY");
			m.yield();//This thread waits and myThread gets more time,
			//you can give as m.yield but its is better to give Thread.yield
			//for m.yield it gives warning but for Thread.yield it doesn't
		}
		
	
	}

}
