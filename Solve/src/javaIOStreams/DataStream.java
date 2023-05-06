package javaIOStreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//if dataoutputstream is used to write the data then datainputstream only has to be used to fetch the data

class Student1
{
	int rollNo;
	String Name;
	float Avg;
	String Dept;
}

class dataStreamOutput
{
	public void method() throws Exception
	{
		
		FileOutputStream fos = new FileOutputStream("C:/JavaFiles/Test9.txt");
		
		DataOutputStream dos = new DataOutputStream(fos);
		
		Student1 s = new Student1();
		
		s.rollNo = 10; s.Name ="Ahmed"; s.Avg = 85.5f; s.Dept = "ECE";
		
		dos.writeInt(s.rollNo);
		dos.writeUTF(s.Name);
		dos.writeFloat(s.Avg);
		dos.writeUTF(s.Dept);
		
		fos.close();
		dos.close();
				
	}
}

class dataStreamInput
{
	public void method() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:/JavaFiles/Test9.txt");
		
		DataInputStream dis = new DataInputStream(fis);
		
		Student1 s = new Student1();
		
		s.rollNo = dis.readInt();
		s.Name = dis.readUTF();
		s.Avg = dis.readFloat();
		s.Dept = dis.readUTF();
		
		System.out.println("RollNo : " + s.rollNo + " Name : " + s.Name + " Average : " + s.Avg + " Department : " + s.Dept);
		
		fis.close();
		dis.close();
	}
}

public class DataStream {
	public static void main(String[] args) throws Exception
	{
		dataStreamOutput dso = new dataStreamOutput();
		dso.method();
		
		dataStreamInput dsi = new dataStreamInput();
		dsi.method();
		
	}

}
