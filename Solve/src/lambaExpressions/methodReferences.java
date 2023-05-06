package lambaExpressions;

/*
 * Method references are created using functional interface
 * 
 */

interface lambaExpress
{
	public void display(String str);
}

class lambaEx
{
	
	public static void reverse(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}
	
	public void reveerse(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
		
	}
}

class lambaEx1
{
	
	public lambaEx1(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}
}



public class methodReferences {
	
	
	public static void main(String[] args)
	{
		lambaExpress lm = System.out::println;//prints whatever arguments you give
		//as String, below i will call the display method of a interface, and that
		//prints whatever you give as a string
		lm.display("calling printmethod by using scoperesolution");//This println
		//method will be assigned to display method, Display method will act like
		//println method
		
		lambaExpress lm1 = lambaEx::reverse;//you can refer the other class methods
		//using the lambda and the methods inside interface calls the methods 
		//inside the class that you have created as an object
		
		lm1.display("calling reverse method");//reverse is a static method
		//so we can directly call the method
		
		//now for non static-method you have to create an object and then assign it
		
		lambaEx le = new lambaEx();
		
		lambaExpress lm2 = le::reveerse;
		
		lm2.display("you can assign non-static method to a interface method by"
				+ "creating the object of a class and using the refrence and"
				+ "scope resolution");
		
		//to call the constructor you have use below method
		
		lambaExpress lm3 = lambaEx1::new;//this assigns the constructor to display
		//method
				
	}	

}

//This interface and class is to check 2 parameters passed

interface lambaExpress1
{
	public int display(String str1, String str2);
	
}

class lambaEx2
{
	public void exampple() {
	lambaExpress1 lme = (str1,str2)->{int a =str1.compareTo(str2);return a; };//here string is a class and compareTo
	//is a method, both are built in
	//for comparing it required one parameter and other one is  an object, it is 
	//like -> compiler takes str1 as object and str2 as parameter and compares them
	//as shown below
	
	//when you call display internally compareTo method will be called
	
	System.out.println(lme.display("Hello","Hello"));//compareTo return integer so,
	//display(String str1,String str2) should have return type as int
	}
}
