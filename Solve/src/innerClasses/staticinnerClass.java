package innerClasses;

/*
 * Static inner classes are the static members of the outer class and object of a
 * static inner classes can be created outside the outer class, you can create 
 * them and access them anywhere and you dont have to create the object of outer
 * class
 * # Static inner class can access members of the outer class but  only the static
 * members not the other memebers
 */

class auterclass
{
	static int x = 10;
	int y = 20;
	
	static class ennerclass
	{
		public void display()
		{
			System.out.println(x);//non static outerclass members cant be accessed
		}
	}
	public void display()
	{
		ennerclass e = new ennerclass();
		e.display();
	}
}
public class staticinnerClass {
	public static void main(String [] args)
	{
		auterclass.ennerclass ae = new auterclass.ennerclass();
		ae.display();
		
		auterclass a = new auterclass();
		a.display();		
		
	}

}
