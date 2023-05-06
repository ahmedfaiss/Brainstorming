package Object_oriented_Progrramming;

class account
{
	private String name, address, dob;
	private double balance;
	private int number;
	
	
	
	
	public String primarydetails()
	{
		return "Name : "+ name + "Address : "+ address+"DOB : " +dob;
	}
	public double balance()
	{
		return balance;
	}
	public int number()
	{
		return number;
	}
}

class savingsaccount extends account
{
	
}

public class Inheritance1 {
	
	public static void main(String [] args)
	{
	
	savingsaccount a = new savingsaccount();
	
	System.out.println(a.primarydetails());
	
	}
}
