class recur
{
	public int fun(int num)
	{
		int number =1;
		if(num>0)
		{
			fun(num-1);
			System.out.println(num);
		
		
		}
		return number;
	}
}

public class recursion {
	public static void main(String args[])
	{
		recur r = new recur();
		int rr  = r.fun(3);
		
		System.out.println(rr);
	}

}
