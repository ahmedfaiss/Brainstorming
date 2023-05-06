package Object_oriented_Progrramming;
class cons
{
	private double length;
	private double breadth;
	public cons()
	{
		
		length =1;
		breadth =1;
		System.out.println(length*breadth);
		
	}
	
	public cons(int l, int b)
	{
		
		length =l;
		breadth =b;
		System.out.println(length*breadth);
		
	}
	
}
public class Contructors {
	public static void main(String [] args)
	{
		cons c = new cons();
		
		cons c1 = new cons(5,6);
	}
}
