package javaIOStreams;

import java.io.*;

class charRead
{
	public void method() throws Exception
	{
		char c[]  = {'a','b','c','d','e','f'};
		CharArrayReader cr = new CharArrayReader(c);
		
		int x;
		
		while((x = cr.read()) != -1)
		{
			System.out.print((char)x);
		}
				
	}
}

class charWrite
{
	public void method() throws Exception
	{
		CharArrayWriter cw = new CharArrayWriter(20);
		
		cw.write('b');
		cw.write('g');
		cw.write('e');
		
		char[] c = cw.toCharArray(); //-> to print in console
		
		for(char f:c)
		{
			System.out.print((char)f);
		} 
			
	}
}

public class charReadAndWrite {
	public static void main(String[] args) throws Exception
	{
		charRead cr = new charRead();
		cr.method();
		
		charWrite cw = new charWrite();
		cw.method();
	}

}
