package jabaLangPackage;
//Object is parent class for every class, for all class which is already define
// and which is going to be created by us is also a sub class of Object class
//java.lang.* is a default package which is by default imported for every class
//we create and can be imported manually by us also

import java.lang.*;//imported manually, if not imported it is by default imported

class myObject//by default it is extending Object class
{
	public String toSring()//we can inherit toString method and return our own value
	{
		return "This is myObject";
	}
	public int hashCode()//inheriting from Object classreturns a value that is 
	//given for a class by Jvm automatically and we can give our own value also
	{
		return 100;//our own value
	}
	
	/*
	 * public void wait(){} -> we can inherit this from object class because 
	 * it is final
	 */
	
	public boolean equals(Object o)
	{
		return this.hashCode() == o.hashCode();//give true or false based on our
		//parameter passed
	}
}


public class objectClass {
	
	public static void main(String [] args)
	{
		Object o1 = new Object();//parent class for all sub class
		Object o2 = new Object();
		System.out.println(o1.equals(o2));//gives false because both references are
		//pointing to different object, they have their own hashCode, So false
		
		System.out.println(o1);//This calls to String method
		System.out.println(o1.toString());//you can call like this also, both refrence
		//will call toString() method itself
		
		Object o3 = new Object();//parent class for all sub class
		Object o4 = o3;//o4 is pointing to same object 
		System.out.println(o4.equals(o3));//returns true
		
		//creating objects for user defined object
		
		myObject m1 = new myObject();
		myObject m2 = new myObject();
		
		System.out.println(m1.equals(m2));//returns true because both have method
		//hashCode and for both,it returns same hashCode that is 100
		
		
	}

}
