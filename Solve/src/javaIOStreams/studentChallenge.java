package javaIOStreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//This program writes float values in the file and prints it using datainputstream and dataoutputstream

class studentWrite
{
	public void method() throws Exception
	{
		FileOutputStream fos = new FileOutputStream("C:/JavaFiles/student_challenge.txt");
		
		DataOutputStream dos = new DataOutputStream(fos);
		
		float list[] = {4.4f, 4.5f, 5.3f, 6.6f, 7.4f};
		
		
		dos.writeInt(list.length);//First writing int  value that is length, so we will know how much value is present
		//inside the array while reading
		
		for(float x:list)
		{
			dos.writeFloat(x);
		}
		
		dos.close();
		fos.close();
	}
}

class studentRead
{
	public void method() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:/JavaFiles/student_challenge.txt");
		
		DataInputStream dis = new DataInputStream(fis);
		
		int length = dis.readInt();//reading the first value that is length 
		
		
		for(int i=0 ; i<length; i++)
		{
			System.out.println(dis.readFloat());
		}
		
		dis.close();
		fis.close();
		
	}
}

public class studentChallenge {
	public static void main(String[] args) throws Exception
	{
		studentWrite sw = new studentWrite();
		sw.method();
		
		studentRead sr = new studentRead();
		sr.method();
	}

}
