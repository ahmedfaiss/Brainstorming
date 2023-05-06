package lambaExpressions;

/*
 * *Lambda expressions are used for defining anonymous methods or nameless methods
 * *It is defined with  the help  of interfaces, If a interface has only single abstract
 *  method then it is called as functional interface
 */
interface myLambda
{
	
	public void display();//for achieving lambda interface should be an functional interface
	//i,e -> only one methods inside interface, you can give annotation also as
	//@FunctionaInterface above this interface and it remembers you to not to add
	//another method
	
	
}


public class Example1 {
	public static void main(String[] args)
	{
		myLambda m = ()-> {System.out.println("Hello world1");};//This is actually
		//anonymous class  with slight change
		m.display();
		
	}

}
