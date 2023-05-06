package Static;

/*
 * # Static keyword is  used for representing meta data
 * # Meta data -> data about data, basically they r useful for representing the
 * information of a class
 * # static variables or methods can be accessed in the main method without creating
 * the object of a class
 * # Only the static variables of a class can be access in the static method but
 * not the non static variable
 * # The value of the static variable or method is fixed, once if you put a value 
 * to the static variable then for all object you create will be getting the same value
 * # non static methods can access static members of a class
 * #only the inner classes can be static, outer class can't be static
 */

class ex{
	static int x = 20;
	int y = 30;
	
	void display()
	{
		System.out.println(x +" "+y);//static and non static variable can be 
		                             // accessed inside non static method
	}
	static void show()
	{
		System.out.println(x);//only the static variable can be accessed
	}
}

public class staticExample {
	public static void main(String [] args)
	{
		ex.show();//by using the name of the class we can access static methods and variables
		System.out.println(ex.x);
		
		ex e = new ex();
		e.display();
		e.show();
		e.x = 30;
		
		ex e1 = new ex();
		System.out.println(e1.x);//x value will be 30 only
		
	}

}
