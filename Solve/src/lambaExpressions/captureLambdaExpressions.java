package lambaExpressions;

interface Demo
{
	public void display();//by default methods under interface is public and abstract
	
}

class Demo1
{
	int count=0;
	public void display1()
	{
		int count1=0;
		Demo d = ()->
		{
			int count2=0;
			System.out.println("only one methos should be present inside interface"
					+ "to use lambda"+count2++);//we can use variables inside lambda
			                                    //and also change it and use it
			
			System.out.println("you can use local variables of a method that is"
					+ "count1 but you can change it, beacause it is final"+count1);
			
			System.out.println("you can use instance variable that is variable"
					+ "that belongs to class and you can and it and use it also"
					+ "instanc variables can be final or is it is not a final,"
					+ " thats ok"+count++);
			
		};
		//as you can see here variables inside lambda and variables of a class
		//(i,e) instance variable can be used as it is or if used by changing
		//the values its not an issue but variables inside a method can be used
		//but can't use by changing the values(like count1++, we can't do ++)
	}
}

class Demo2
{
	//we can also pass arguments to lambda expression, it can be object arguments also
	public void display2(Demo d)
	{
		d.display();
	}
}

class Demo3//Demo2 and Demo3 are connected to show arguments passing as object
//Demo1 is to show how it can read variables
{
	public void method()
	{
		Demo2 d2 = new Demo2();
		d2.display2(()->{System.out.println("passing object as lambda");});

	}
}


public class captureLambdaExpressions {
	public static void main(String [] args)
	{
		Demo3 d3 = new Demo3();
		d3.method();
		
	}

}
