package innerClasses;
/*
 * # if you have to implement an interface and its usage is limited you dont have 
 * to write an separate class and then create its object then and there in the 
 * same place you can implement the interface or abstract class as anonymous class
 */
abstract class my
{
	abstract void display();
}

class Oouterclass
{
	public void method()
	{
		my m = new my()
			{
			void display()
				
				{
					System.out.println("This is anonymous class");
				}
			};
			m.display();
	}
	
	public void method1()
	{
		Oouterclass o = new Oouterclass()
				{
					public void method()
					{
						System.out.println("Hello");
					}
				};
		o.method();
	}
}

public class anonymousClass {
	
	public static void main(String [] args)
	{
		Oouterclass o = new Oouterclass();
		o.method();
		o.method1();
		
	}

}
