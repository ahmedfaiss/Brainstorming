/*
 * # you can print interface method in main by making method as static and without  
 * you can print any identifiers in the main method as you can see below
 * # but in abstract we can write a method without using static but can't access 
 * anywhere out the abstract class
 * # Identifiers are by default static and final (i.e -> constant) inside the
 * interface class
 * # interface can extend another interface -> EX :(interface member extends mem1)
 * # From java 8 onwards instead of static in method we can also write default 
 * method but can't access in anywhere -> becuz after some time if you want to
 * write some methods and use it in some other class then it is useful shown below 
 * # From java 9 Private methods also writable and accessible with default method
 * inside the same interface 
 * # This default method is accessible in sub class but if you inherit it then
 * inherited method will be called
 * # Static block cant be written inside interface
 */



package Interface;

interface member
{
	int x = 10;// -> identifier
	/*public static void hello()
	{
		System.out.println("sfhg");
	}
	
	default void hello() -> this method can be called in sub class without defining the body
	{
	
	}
	*/
	default void hello1()//only accessible inside subclass but directly in main
	//method we can access as static method
	{
	}
	static void hello()//we can directly access in main method
	{
		System.out.println("fhs"+x);//as identifier is automatically static and
		//final it is accessible inside static method
	}
	void callback();
	
}

class  store
{
	member mem[] = new member[100];
	int count  = 0;
	
	void register(member m)
	{
		mem[count++] = m;
		
	}
	void inviteSale()
	{
		for(int i = 0 ;i < count ; i++)
		{
			mem[i].callback();
		}
	}
	
	
}

class customer implements member
{
	String n;
	void register(String n)
	{
		this.n = n;
	}
	public void callback()
	{
		System.out.println(n +" there is  an offer");
	}
	
}


public class interfaceExample {
	public static void main(String []args)
	{
		store s = new store();
		
		customer c1 = new customer();
		customer c2 = new customer();
		 c1.register("Faisal");
		 c2 .register("Ahmed");
		 
		 s.register(c1);
		 s.register(c2);
		 
		 
		 s.inviteSale();
		 

		// member.hello(); we can access static method from interface
		//Ex : System.out.println(member.x);
		
	}

}

