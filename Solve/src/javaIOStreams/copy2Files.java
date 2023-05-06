package javaIOStreams;

import java.io.*;

class copying2FilesToAnotherFile
{
	public void method()
	{
		try
		{
			FileInputStream fis1 = new FileInputStream("C:/JavaFiles/test.txt");
			FileInputStream fis2 = new FileInputStream("C:/JavaFiles/test1.txt");
			
			SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
			
			FileOutputStream fos = new FileOutputStream("C:/JavaFiles/test6.txt");
			
			int b;
			
			while((b = sis.read()) != -1)
			{
				fos.write((char)b);
			}
			
			fis1.close();
			fis2.close();
			sis.close();
			fos.close();
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}

public class copy2Files {
	
	public static void main(String[] args)
	{
		copying2FilesToAnotherFile cp = new copying2FilesToAnotherFile();
		cp.method();
	}

}
