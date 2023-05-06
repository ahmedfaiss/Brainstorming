package collectionFramework;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;


class stringTokenizer
{
	public void method()
	{
		String data  = "Name=Faisal;Age=23;Color=Brown";
		
		String data1 = "Name;Faisal\nAge;23\nColor;Brown";//you have to give delimeter as ; and \n, if you don't give \n then java takes it 
		//automatically, only for \n others we have to define
		
		StringTokenizer stk1 = new StringTokenizer(data1,";");//here we didnt give \n but still complier takes it, but if you dont give ; then 
		//java takes Name;Faisal as one token
		
		StringTokenizer stk = new StringTokenizer(data,"=;");//we are passing delimeter to say that after = and ; take it as separate token
		
		System.out.println("\n Printing the tokens from editor itself\n");
		
		while(stk.hasMoreElements())//hasMoreElements() or hasMoreTokens() both the methods are same, to search whether there is another element
		{
			String s = stk.nextToken();
			System.out.println(s);//it will take each element after = and ; and prints it
			
		}
		
	}
}

class stringTokenizerEx1//this is for loading from the file
{
	public void method() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:/JavaFiles/StringTokenizer.txt");
		byte b[] = new byte[fis.available()];
		fis.read(b);
		
		String data = new String(b);
		
		StringTokenizer stk = new StringTokenizer(data,"=;");//reading from file and taking token after = and ;
		
		System.out.println("\n Printing the token from File\n");
		
		String s;
		while(stk.hasMoreElements())
		{
			s = stk.nextToken();
			System.out.println(s);
		}
		
		
	}
}

class stringTokenizerEx2 
{
	public void method() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:/JavaFiles/StringTokenizer1.txt");
		byte b[] = new byte[fis.available()];
		fis.read(b);
		
		String data = new String(b);
		
		StringTokenizer stk = new StringTokenizer(data,",");
		
		String s;
		
		ArrayList<Integer> al = new ArrayList<>();//you can give generic as String but lets see how to convert string to integer
		
		while(stk.hasMoreTokens())
		{
			s = stk.nextToken();
			
			al.add(Integer.valueOf(s));//storing in arrayList by converting sting to integer because StringTokenizer only takes String
		}
		
		System.out.println(al);
		
	}
}

public class usingStringTokenizer {
	public static void main(String[] args) throws Exception
	{
		stringTokenizer s = new stringTokenizer();
		s.method();
		
		stringTokenizerEx1 s1 = new stringTokenizerEx1();
		s1.method();
		
		stringTokenizerEx2 s2 = new stringTokenizerEx2();
		s2.method();
		
	}

}
