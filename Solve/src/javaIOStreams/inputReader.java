package javaIOStreams;

import java.io.*;

class readerEx
{
	public void method()
	{
		try(FileReader fr = new FileReader("C:/JavaFiles/test1.txt"))
		{
			int x;
			
			while((x =fr.read()) != -1)
			{
				System.out.print((char)x);
			}
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
}

public class inputReader {
	
	public static void main(String[] args)
	{
		readerEx r = new readerEx();
		r.method();
	}

}
