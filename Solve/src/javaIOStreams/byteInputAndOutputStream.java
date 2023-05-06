package javaIOStreams;

import java.io.*;

class byteInput//to read byte arrays, actually byte values are stored in array input stream like a buffer , to print it
//we are loading from there to string and then printing it
{
	public void method() throws Exception
	{
		byte[] b = {'a','b','c','d','f','r','s'};
		
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		
		String str = new String(bis.readAllBytes());//reads all bytes at a time
		//or you can read one byte at a time by following method
		//int x; while((x= bis.read()) != -1){} -> reading one byte at a time
		
		System.out.println(str);
		
		bis.close();		
		
	}
}

class byteOutput
{
	public void method() throws Exception
	{

		ByteArrayOutputStream bos = new ByteArrayOutputStream(20);//just you have to mention the size it will create
		//its own byte array
		
		bos.write('a');
		bos.write('b');
		bos.write('d');//These are all stored in byte array inside the Stream
		//So to read that byte stored in streams you have to store it in byte array as shown below
		
		byte[] b = bos.toByteArray();
		
		for(byte x:b)
		{
			System.out.print((char)x);
		}
		
		//Also you can write it to File by  writing as shown below
		
		//bos.writeTo(new FileOutputStream("C:/JavaFile/byteOutput.txt")); -> this method shows to  write it in file
		
		bos.close();	
		
	}
}

public class byteInputAndOutputStream {
	public static void main(String[] args) throws Exception
	{
		byteInput bi = new byteInput();
		
		bi.method();
		
		byteOutput bo = new byteOutput();
		bo.method();
	}

}
