package javaIOStreams;

import java.io.*;

class bufferreader
{
	public void method() throws Exception
	{
		FileReader fr = new FileReader("C:/JavaFiles/test1.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		
		br.mark(10);
		
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		
		br.reset();
		
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		
		System.out.print(br.readLine());
		
		
		fr.close();
		br.close();
	}
}

public class bufferedreader {
	
	public static void main(String[] args) throws Exception
	{
		bufferreader br = new bufferreader();
		br.method();
	}

}
