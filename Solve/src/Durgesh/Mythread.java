package Durgesh;

public class Mythread implements Runnable{
	@Override
	public void run()
	{
		for(int i=1;i<10;i++)
		{
			System.out.println("I am" + Thread.currentThread().getName());
			try{
				Thread.sleep(1000);
				}
			catch(Exception e)
			{
				
			}
		}
	}
	

}
