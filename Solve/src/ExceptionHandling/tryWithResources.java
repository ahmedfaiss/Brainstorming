package ExceptionHandling;
/*
 * * if you use any resource you should close after using it or else it is not good
 *   in other programming language it is not there but in java we can close as soon
 *   as we are done with using it and we can do it by ourselves or by automatically
 *   by the java.
 * * if you use try with resources then it will automatically close the resources
 * * It will automatically close only if the objects we are using to use resource 
 *   has the close method, For Ex : if we are using file then to read file we use
 *   FileInputStream object from parent class -> java.io.*; -> So this FileInputStream
 *   has close method, So try can close the resource as soon as we are using it
 */

import java.io.*;
import java.util.*;

// we can also close by ourselves as I show below with diff class

class closeOurSelves 
{
	static FileInputStream fi;
	static Scanner sc;
	
	static void divide() throws Exception
	{
		try
		{
			fi = new FileInputStream("c:/drive/my.txt");//this is just example
			sc = new Scanner(fi);
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int d = a/b;//if any problem occurs here then finally block will be
			//executed and then throws exception
			
		}
		finally
		{
			fi.close();
			sc.close();//we can close by ourselves like this if any problem occurs
			
		}
	}
}

//Below I will show how to close automatically by using try with resources
public class tryWithResources {	
	
	static void divide() throws Exception
	{
		try(FileInputStream fi = new FileInputStream("c:/drive/my.txt"); Scanner sc = new Scanner(fi))
		//Above is called as Try with resources, So it will close automatically 
		//either by completion of using or if any problem occurs also, So we
		//don't have to define ourselves
		{
			
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int d = a/b;//if any problem occurs here then resources are closed
			//and then exception is called 
			//you have to write throws because we are not handling here, So
			//if we use FileInputStream or any other checked exception class
			//then either we have to handle right away or should throw an exception
			
		}
	}
	
	public static void main(String [] args) throws Exception
	{
		divide();//here also I am not handling exception so i am throwing exception
		//if I use file then I will get an error because file is closed
		
		//int d = sc.nextInt(); -> this error becuz Scanner is closed already
		//anyway this program will throw error becuz I have not created text file
	}

}
