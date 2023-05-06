package javaIOStreams;

import java.io.*;

class copyFileInput
{
	public void method()
	{
		try
		{
			int x;
			
			//copying from one file to another
			
			FileInputStream fis = new FileInputStream("C:/JavaFiles/test.txt");
			FileOutputStream fos = new FileOutputStream("C:/JavaFiles/test5.txt");
			
			int b;
			
			while((b = fis.read()) != -1)
			{
				if(b>=97 && b<=123)//if the letters are small then convert to capital letters
				{
					fos.write(b-32);
				}
				else
				{
					fos.write(b);
				}
			}
			fis.close();
			fos.close();
			
			
		}
		
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
}

public class copyAFile {
	public static void main(String[] args)
	{
		copyFileInput cp = new copyFileInput();
		cp.method();
	}
	
	

}
