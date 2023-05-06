import java.util.*;

class rev
{
	
	public void operation(int num)
	{
		String no="";
		
		while(num>0)
		{
			int num1 = num%10;
			 num = num/10;
			
			
			
			String nu = Integer.toString(num1);
			no += nu;
			
			
		}
		
		int num2 = Integer.parseInt(no);
		
		System.out.println(num2);
	}
}
public class reverse {
	
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		
		int num  = s.nextInt();
		
		rev r = new rev();
		r.operation(num);
	}

}
