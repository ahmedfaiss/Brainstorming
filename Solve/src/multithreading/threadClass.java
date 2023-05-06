package multithreading;

class threadEx extends Thread
{
	public void run()
	{
		for(int i = 0 ; i < 1000 ; i++)
		{
			
			System.out.println("Ahmed");
		}
	}
}

class threadEx3 extends Thread//you can use thread class by extending like this
//also because multiple inheritance is not possible
{
	public void run()
	{
		for(int i = 0 ; i < 1000 ; i++)
		{
			
			System.out.println("LuLu");
		}
	}
}

public class threadClass
{
	public static void main(String [] args)
	{
		threadEx t = new threadEx();
		t.start();
		
		//threadEx2 t2 = new threadEx2(); -> this is also possible
		
		//t2.start();
		//you can achieve in a single class also as shown in usingRunnableInterface
		
		
		for(int i = 0 ; i < 1000 ; i++)
		{
			System.out.println("Faisal");
		}
	}
}
