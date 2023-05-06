package innerClasses;
/*
 * # Local class is usefull when you write a class that is inheriting from some
 * existing class or you want to write a class which is implementing an interface
 */
class outerClass
{
	static int z = 11;
	int x = 10;
	public void display()
	{
		class innerClass
		{
			int y = 20;
			
			public void display()
			{
				System.out.println(x + " " +y+" "+z);
			}	
		}
		innerClass in = new innerClass();//this class is not visible outside the method
		in.display();
	}
		
	
	
}

public class localClass {
	public static void main(String  [] args)
	{
		outerClass ot = new outerClass();
		ot.display();
		
		
		
	}
}
