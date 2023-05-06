package Object_oriented_Progrramming;

class Super
{
	public void display()
	{
		System.out.println("Super class");
	}
}

class sub extends Super
{
	public void display()
	{
		System.out.println("Sub class");
	}
}
public class MethodOverriding {// Method overriding is achieved in inheritance
	public static void main(String [] args)
	{
		Super s = new Super();
		sub sb = new sub();
		Super su  = new sub();//Dynamic dispatch -> reference is Super class and object is sub class
		sb.display();
		
		su.display();//Dynamic method dispatch -> calls sub class method
		//for Dynamic dispatch only methods that are present in both the class 
		//only will be called, If new method is present in sub class but not in 
		//super class then that new method can't be called only super class
		//reference and sub class object is possible, the vice versa is not 
		//possible
	}
}
