package multithreading;

//In This program producer puts value and consumer fetches the value but shouldn't
//be the same value fetching by the consumer while producer changing the values
class MyDataa
{
	int value = 0;
	
	boolean flag = true;
	synchronized public void set(int x)
	{
		while(flag != true)
		{
			try
			{
				wait();//checked exception so it should be handled
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		value = x;
		flag = false;
		notify();//notifies that I have set the value 
	}
	
	synchronized public int get()
	{
		
		while(flag != false)
		{
			try
			{
				wait();//checked exception so it should be handled
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
		}
		flag = true;
		notify();//notifies that I have accessed the vlaue
		return value;
		
		
		
		
	}
}

class Producer extends Thread
{
	MyDataa my;
	
	Producer(MyDataa my)
	{
		this.my = my;
	}
	public void run()
	{
		int count = 0;
		for(int i = 0 ; i < 100; i++)
		{
			my.set(i);
			System.out.println("Producer "+ count++);
			
			try
			{
				Thread.sleep(1000);//checked exception so it should be handled
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}

class Consumer extends Thread
{
	MyDataa my;
	Consumer(MyDataa my)
	{
		this.my = my;
		
	}
	
	public void run()
	{
		int value;
		for(int i = 0 ; i < 100 ; i++)
		{
			value  = my.get();
			System.out.println("Consumer "+value);
			
			try
			{
				Thread.sleep(1000);//checked exception so it should be handled
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
		}
	}
}


public class interThread {
	public static void main(String[] args)
	{
		MyDataa my  = new MyDataa();
		
		Producer p = new Producer(my);
		Consumer c = new Consumer(my);
		
		p.start();
		c.start();
	}

}
