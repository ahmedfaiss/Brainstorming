package javaIOStreams;

//to use FileOutputStream we have to import IO

import java.io.*;

class Output 
{
	public void method()
	{
		
		try
		{
			FileOutputStream fos = new FileOutputStream("C:/JavaFiles/test.txt");
			
			String str = "Hi, this  is faisal, this text file is created using java";
			
			fos.write(str.getBytes());
			
			byte[] b = str.getBytes();
			
			for(byte x:b)
			{
				fos.write(x);//you can write at a time 1 byte
			}
			
			//you can also skip some of the words by doing as shown below
			
			byte[] c = str.getBytes();
			
			fos.write(c, 4, str.length()-4);//first 4 letter is written already
			//that is from 0 to 3 and from 4 you don't want to write anything till
			//length 9 , so now the length starts from 4 only, So i have written 
			//str.length()-4, so length-6 will be written in length section
			
			fos.close();
			
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

class Output1 
{
	public void method() throws Exception
	{
		
		try(FileOutputStream fos = new FileOutputStream("C:/JavaFiles/test1.txt"))//try with resource
		{
			
			
			String str = "Hi, this  is faisal, this text file is created using java";
			
			byte[] b = str.getBytes();//gets all the bytes from str, converts from string to bytes
			
			fos.write(b);
			
			
		}
	}
}

public class fileOutputStream {
	public static void main(String[] args) throws Exception
	{
		Output o = new Output();
		o.method();
		
		Output1 o1 = new Output1();
		o1.method();
		
		
	}

}

