package javaIOStreams;

import java.io.RandomAccessFile;


//in sequence access the file pointer will move in only one direction and it can't read wherever you want, it reads from 
//the top and reaches till the end, If you stop in between and again read then file pointer will start from the top again
//but file pointer won't continue where it started but in Random access, the file pointer can be moved where ever we want
//Random access can be used when you are fully aware of the program, you can also get to know where the file pointer is
//actually pointing
//Java has a class called Random access, this class is implementing datainput and dataoutput interfaces
//These interfaces are implemented by object input stream and

class randomReadWrite
{
	public void method() throws Exception {
		
		RandomAccessFile ra = new RandomAccessFile("C:/JavaFiles/test1.txt","rw");
		
		System.out.println((char)ra.read());
		System.out.println((char)ra.read());
		System.out.println((char)ra.read());
		
		ra.skipBytes(4);//skips bytes of 4
		
		System.out.println((char)ra.read());
		System.out.println((char)ra.read());
		System.out.println((char)ra.read());
		
		ra.seek(3);//filepointer points to that index
		
		System.out.println(ra.getFilePointer());//gives at what position the filePointer is
		
		System.out.println((char)ra.read());
		System.out.println((char)ra.read());
		System.out.println((char)ra.read());
		
		System.out.println(ra.getFilePointer());
		
		ra.close();
		
	}
}

public class randomAccessFile {
	public static void main(String[] args) throws Exception
	{
		randomReadWrite rw = new randomReadWrite();
		
		rw.method();
		
	}

}
