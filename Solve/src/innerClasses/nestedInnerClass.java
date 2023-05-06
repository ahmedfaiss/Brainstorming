package innerClasses;

class outer
{
	int x = 10;
	
	inner i  = new inner();//we can define object before creating class also, So 
	//its not a problem
	
	class inner
	{
		int y = 20;
		
		public void display()
		{
			System.out.println(x+" "+y);
		}
	}
	
	public void outDisplay()
	{
		inner i  = new inner();
		i.display();
	}
}


public class nestedInnerClass {
	
	public static void main(String []args)
	{
		outer o = new outer();
		o.outDisplay();//accessing the outer class
		outer.inner oi = new outer().new inner();//accessing the inner class
		oi.display();	
	}

}
