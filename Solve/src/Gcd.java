import java.util.Scanner;

class gcde
{
	public void opea(int num, int num1)
	{
		int number;
		
		if(num>num1)
		{
			number = num;	
		}
		else
		{
			number = num;
		}
		
		
		
		int [] arr = new int[number];
		int [] arr1 = new int[number];
		
		int res = 0, res1 = 0;
		
		for(int i=1; i<number; i++)
		{
			if(num % i ==0)
			{
				arr[i] = i;
			}
			
		}
		
		for(int i=1; i<
				number; i++)
		{
			if(num1 % i ==0)
			{
				arr1[i] = i;
			}
			
		}
		
		for(int i =1; i<number; i++)
		{
			if(arr[i] == arr1[i] && arr[i] !=0 && arr1[i] !=0)
			{
				res = arr[i];
			}
		}
		
	
		
		System.out.println("The GCD of a number is "+res);
	}
}


public class Gcd{
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		
		int num  = s.nextInt();
		
		int num1 = s.nextInt();
		
		gcde g = new gcde();
		g.opea(num,num1);
	}

}

