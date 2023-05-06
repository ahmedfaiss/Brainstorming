package Generics;

class Method
{
	public <T> void method1(T[] element)//You can define Generic method by using <> before return type of a method 
	{
		for(T x:element)
		{
			System.out.println(x);
		}
	}
	
	public <T> void method2(T... element)
	{
		for(T x:element)
		{
			System.out.println(x);
		}
	}
}

public class genericMethod {
	static <T extends Number> void method(T[] list)//Generic bounds for method
	{
		for(T x:list)
		{
			System.out.println(x);
		}
	}
	public static void main(String[] args)
	{
		Method m = new Method();
		m.method1(new String[]{"Hello","hello1","hello2"});//It takes any object and prints
		m.method1(new Integer[] {10,20,30});
		
		//method(new String[]{"Hello","hello2","hello3"}); throws error because bounding is used for Numbers
		
		Method m1 = new Method();
		m1.method2("hello","hello2","hello3",10);//you can pass any object type
		
	}

}
