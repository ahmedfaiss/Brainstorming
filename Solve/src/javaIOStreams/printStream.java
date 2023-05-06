package javaIOStreams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Student
{
	int rollNo;
	String Name;
	String Dept;
}

class printWrite //this class is to write to the file using printstream
{
	public void method() throws Exception
	{
		FileOutputStream fos = new FileOutputStream("C:/JavaFiles/Test8.txt");//fileoutputStream is connected to Test8
	
		
		PrintStream ps = new PrintStream(fos);//PrintStream is connected to FileOutputstream
		
		Student s = new Student();
		
		s.rollNo=10; s.Name="Faisal"; s.Dept ="ECE";
		
		ps.println(s.rollNo);//printing the values in the file and all the values stores a String itself
		ps.println(s.Name);
		ps.println(s.Dept);
		
		fos.close();
		ps.close();
	}
}

class Read
{
	public void method() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:/JavaFiles/Test8.txt");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));//upon inputStream we can't assign a Reader
		//so we need a connector that is InputStreamReader which will connect FileInputStream and BufferedReader
		
		Student s = new Student();
		s.rollNo = Integer.parseInt(br.readLine());//the value in the textfile is String but rollNo is int, So we have
			//convert String to int to store in rollNo
		s.Name = br.readLine();
		s.Dept = br.readLine();
		
		System.out.println("RollNo : "+ s.rollNo + " Name : " + s.Name + " " + " Dept : " + s.Dept);
		
		fis.close();
		br.close();
		
		
	}
}

public class printStream {
	public static void main(String[] args) throws Exception 
	{
		printWrite pw = new printWrite();
		pw.method();
		
		Read r = new Read();
		r.method();
		
	}

}
