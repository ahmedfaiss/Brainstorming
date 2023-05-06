package multithreading;

class Mydata
{
	/*synchronized* you can write like that also*/ public void display(String str)
	{
		synchronized(this)//you can either write like this or like above in the 
		//method itself
		{
			for(int i = 0 ; i <str.length() ; i++)
			{
				System.out.print(str.charAt(i));
			}
		}
	}
}
//monitor means just making use of shared object one by one
class myThread1Ex extends Thread
{
	Mydata data;
	myThread1Ex(Mydata data)
	{
		this.data = data;
	}
	
	public void run()
	{
		data.display("Faisal");
	}
}

class myThread2Ex extends Thread
{
	Mydata data;
	myThread2Ex(Mydata data)
	{
		this.data = data;
	}
	public void run()
	{
		data.display("Ahmed");
	}
}


public class SynchronizationEx {
	public static void main(String[] args)
	{
		Mydata data = new Mydata();
		myThread1Ex thread1  = new myThread1Ex(data);
		myThread2Ex thread2 =  new myThread2Ex(data);
		thread1.start();
		thread2.start();
		//If you don't use synchronization then output will not be sequential
		//to make thread1 finish first and thread 2 to use after thread1 then 
		//synchronization should be used in loop or method
	}

}
