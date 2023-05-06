package ExceptionHandling;

import java.util.Scanner;

public class try_and_Catch {
	
	public static void main(String []args)
	{
		int a,b,c;
		
		Scanner s = new Scanner(System.in);
		
		a = s.nextInt();
		b = s.nextInt();
		
		try {
			
			c= a/b;
			System.out.println("The division is "+c);
		}
		catch(ArithmeticException e){
			
			System.out.println("you did some mistake - "+e);
		}
		
		System.out.println("If you have given the correct value then division will be successfull");
	}

}
