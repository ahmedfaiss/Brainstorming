


class reveerse
{
	
	public boolean operation(String sb)
	{
		
		StringBuffer sb1 = new StringBuffer(sb);
		
		sb1.reverse();
		
		String data = sb1.toString();
		
	
		
		if(sb.equals(data))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
}


public class Palindrome {
	public static void main(String[] args)
	{
		reveerse r = new reveerse();
		boolean result = r.operation("malayalam");
		if(result == true)
		{
			System.out.println("Palindrome");
			
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
	
}



}