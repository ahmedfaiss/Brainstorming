import java.util.*;

class divisible
{
	public void ope(int num)
	{
		int count = 0;
		
		for(int i=1; i<=num; i++)
		{
			if(num % i ==0)
			{
				count++;
			}
		}
		
		if(count>2)
		{
			System.out.print("The number is not a prime  ");
		}
		else
		{
			System.out.println("The number is prime");
		}
	}
}


public class Prime {
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = s.nextInt();
		
		divisible o = new divisible();
		o.ope(num);
	}

	
	
}
