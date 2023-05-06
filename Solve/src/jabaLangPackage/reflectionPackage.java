package jabaLangPackage;

import java.lang.reflect.*;

//Can we look inside the class and get details of the class? >yes we can
//that is done using reflection package
//There is class called -> Class, by using this we can get a definition of a class

class mY
{
	private int count;
	protected String name;
	public double age;
	public char word;
	
	public mY() {}
	public mY(int a, int b) {}
	
	public void name(String n) {int a; String b;}
	public int Age(int a) {return 3;}
	
	
	
}

public class reflectionPackage {
	
	public static void main(String[] args)
	{
		Class a = mY.class;//When we compile we get a class file, So by using
		//class_name.class we can get description of that class
		
		//or you can get definition of a class by below method
		
		System.out.println(a.getName());//gives the name of the class
		
		mY a1 = new mY();
		Class a2 = a1.getClass();//we can also have definition of the class
		//but declaring like this
		
		Field field[] = a2.getDeclaredFields();//gives all the fields(i,e) variables
		//of the class with access specifier name and package too
		
		//To print the fields
		
		for(Field value:field)
		{
			System.out.println(value);//prints -> access specifier, data types, package and name
			
		}
		
		//to get constructors of a class
		
		Constructor ct[] = a.getConstructors();
		
		for(Constructor c:ct)
		{
			System.out.println(c);//gives access specifier, package and constructors
			
		}
		
		//to get methods of a class
		
		
		Method m[] = a.getMethods();//gives method info of class and also object class
		//So if you want to get methods of only the class then use getDeclaredMethods
		
		for(Method mt:m)
		{
			System.out.println("\n"+mt);
		}
		
		//also you can get parameters of a method also
		
		Parameter pm[] = m[0].getParameters();//gives info of parameter of a method
		
		for(Parameter pmt:pm)
		{
			System.out.println(pmt);
		}
	}

}
