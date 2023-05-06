package multithreading;

class ATM
{
	synchronized public void checkBalance(String name)
	{
		System.out.println(name + " is checking the balance");
		
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
	}
	synchronized public void withDraw(String name, int amount)
	{
		System.out.println(name + " is withdrawing the amount of "+ amount);
		
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
	}
}

class customer extends Thread
{
	ATM atm;
	String name;
	int amount;
	
	customer(String name, int amount, ATM atm)
	{
		this.atm = atm;
		this.name = name;
		this.amount = amount;
		
	}
	
	public void run()
	{
		atm.checkBalance(name);
		atm.withDraw(name, amount);
	}
}
public class studentChallenge {
	
	public static void main(String [] args)
	{
		ATM a = new ATM();
		customer c1 = new customer("Faisal",5000,a);
		customer c2 = new customer("Ahmed",6000,a);
		c1.start();
		c2.start();
	}

}
