package ExceptionHandling;
import java.util.Scanner;

public class nested_Try_Catch 
{
	public static void main(String[] args)
	{
		int c;
		int [] a = {1,2,3,4,5};
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the numbers");
		
		try
		{
			c= a[0]/a[1];
			System.out.println("The division is "+c);
			
			System.out.println(a[3]);
		}
		//you can also have try block inside try
		
		catch(ArithmeticException e)
		{
			System.out.println("Denominator should not be Zero");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Check the array size");
		}
	}

}
