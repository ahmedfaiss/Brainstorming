package Object_oriented_Progrramming;

/*There are 2 types of classes -> 1. Abstract class
 *  2. Concrete class
 * # The class we write normally, we inherit, we create object and abstract 
 * is not written in the beginning of class creation then it is called as 
 * concrete class.
 * # Then if the class is defined as abstract class then objects can't be created 
 * for that but you can create a reference for abstract class.
 * # Abstract method -> EX : abstract void display(); -> It can't have the body
 * # A semicolon should be used after defining the method (An undefined method
 * is called as abstract method).
 * # If a class has one abstract method then definitely class becomes abstract(i,e
 * if there is something which is not defined completely then class itself is not
 * is defined completely).
 * # If a class has one abstract method then class should be made as abstract.
 * # Without abstract method also class can be made abstract.
 * # If a class inherits from a abstract class then that sub class also becomes
 * abstract class.
 * #The sub class which inherited from the abstract class can become concrete class 
 * only if it overrides all the abstract methods of abstract class in the sub class
 */

abstract class Suuper
{
	int x = 10;
	public  void hehe()
	{
		System.out.println("jsfh");
	}
	public void meth1()
	{
		System.out.println("Super class");
	}
	public Suuper()
	{
		System.out.println("Super constructor");
	}
	
	abstract public void meth2();//The class should be specified as abstract
}

class Sob extends Suuper //Should override abstract method of super class with body
{
	public void meth2()
	{
		System.out.println("Sub class");
	}
}

public class abstractClass {
	public static void main(String [] args)
	{
		Suuper s = new Sob(); //can have abstract class reference but not object
		
		s.meth2();
		s.meth1();
		
		}
}
