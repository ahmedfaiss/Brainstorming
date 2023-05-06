package Harry;

public class Recursion {
	
	
	
	static int factorial(int n)
	{
		n = n*factorial(n-1);
		return n;
	}
	
		
	
	
	
	public static void main(String[]args)
	{
		Recursion r = new Recursion();
		System.out.println(r.factorial(5));
		
		
	}

}
