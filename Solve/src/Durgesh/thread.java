package Durgesh;

public class thread {
	public static void main(String [] args)
	{
		System.out.println(Thread.currentThread().getName());
		
		Mythread mythread = new Mythread();
		Thread t = new Thread(mythread);
		t.start();
		
		Runnable t2 = new Runnable()
		{
			@Override
			public void run()
				{
				
				System.out.println("I am thread" + Thread.currentThread().getName());
				
				}
		};
		
		Thread t1 = new Thread(t2);
		t1.start();
		
		
		
	}
}
