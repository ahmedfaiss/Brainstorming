package javaIOStreams;

import java.io.*;

class inputEx
{
	public void method()
	{
		try
		{
			int x;
		
			FileInputStream fis = new FileInputStream("c:/JavaFiles/test.txt");
			
			
			
			do
			{
				x= fis.read();
				System.out.print((char)x);
			}
			while(x!=0);
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
}

class inputEx1
{
	public void method()
	{
		try
		{
		
		
			FileInputStream fis = new FileInputStream("c:/JavaFiles/test.txt");
			
			byte b[] = new byte[fis.available()];
			
			for(byte x:b)
			{
				System.out.print(x);
			}
			
			//or you can write it like
			// int x;
			//while((x = fis.read()) != -1)
			//{
			//		System.out.pritnln((char)x);
			
		}
		catch(IOException e)
		{
			
		System.out.println(e);
		}
	}
}

public class fileInputStream {
	public static void main(String[] args)
	{
		inputEx1 in  = new inputEx1();
		in.method();
	}

}
