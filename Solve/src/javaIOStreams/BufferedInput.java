package javaIOStreams;

import java.io.*;

class bufferedInputStream //reads bytes but bufferedReader reads character
{
	public void method() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:/JavaFiles/test1.txt");//This is not marksupported
		
		BufferedInputStream bis = new BufferedInputStream(fis);//This is marksupported
		
		byte[] b = bis.readAllBytes();
		
		for(byte x:b)
		{
			System.out.print((char)x);
		}
		fis.close();
		bis.close();
	}
}

public class BufferedInput {
	public static void main(String[] args) throws Exception
	{
		bufferedInputStream bi = new bufferedInputStream();
		bi.method();
		
	}

}
