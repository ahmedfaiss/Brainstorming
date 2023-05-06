package finalClass;
/*
 * #final data members have to initialized if it is a member of class
 * # final data members can be initialized after declaring the final variable
 * # final class, members, method cannot be extended, overrided, initialized with
 * other values respectively
 * # final data members can be initialized inside the instance block
 * # final data members can be initialized inside the static block only if the  
 * data members are static
 * # Also you can initialize inside the constructor
 */

class finalDatamembers
{
	final float PI = 3.14f;//should be initialzed if it is data member of a class
	
	final float PI1;
	{
		PI1 = 3.1425f;//this is called instance block, can be initialized like this
	}
	
	static final float PI2;
	static
	{
		PI2 = 3.1435f;//can be initialized in the static block only if the  data member
		              // are initialized  as static
	}
	
	public void display()
	{
		final float PI3;
		PI3 = 3.1435f;//can be initialized after declaring the final variable
					  // only if the final variable is inside the method
	}
}
public class finalEx {

}
