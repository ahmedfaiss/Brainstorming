import java.util.*;

class variable
{
	public void show(String...ar)//This is called variable arguments 
	        //where it takes as many arguments with the similar data types
	{
		String a = ar[0]; 
		for(int i=0 ;i <ar.length;i++)
		{
		System.out.println(ar[i]);
		}
	}
}
public class Variablearguments {
	public static void main(String [] args)
	{
		variable v = new variable();
		
		v.show("Hello","skjgh","jfgk");
		//you can add other parameters with different data types but only at the
		//beginning, variable parameters should be the last one or else it will give an error
	}
}
