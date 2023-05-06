package multithreading;

class ThreadEx2 extends Thread
{
	public ThreadEx2(String name)
	{
		super(name);//To set name in Thread class we have to call super(Thread) class
		setPriority(Thread.NORM_PRIORITY+2);//now the value is 5+2
		
	}
	
	public void run()
	{
		for(int i = 0 ; i < 5000 ; i++)
		{
			System.out.println(i);
			
			try
			{
				Thread.sleep(100);//it will wait for 100 milliseconds and executes
				//for block, as it is static method we can call by using class name
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
		}
	}
}


public class getterAndsetterMethodsOfThread {
	public static void main(String[] args)
	{
		
		ThreadEx2 t2 = new ThreadEx2("Thread1");
		//you can directly give name, this is just to  show how to give name
		//by creating constructor and you can also pass object, for Ex:
		// t2 = new ThreadEx2(new ThreadEx2(),"Name")-> this is also possible
		
		System.out.println("ID "+t2.getId());
		System.out.println("Name "+t2.getName());
		System.out.println("Priority "+t2.getPriority());
		System.out.println("State "+t2.getState());
		System.out.println("Alive "+t2.isAlive());//Gives false if we didnt run
		
		t2.start();
		
		//So we can interrupt in between by using interrupt method as shown below
		
		t2.interrupt();//so it is interrupting in between so it is handled using
		//Exception and it shows that message in output and continues for loop
		
		
		
		
	}

}
