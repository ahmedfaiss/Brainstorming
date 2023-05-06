package javaIOStreams;

import java.io.*;

//by using file we can know whatever we want, whether it is a directory, folder, is it hidden.
//we can get the files in the directory etc

class FileClassEx
{
	public void method()
	{
		File f = new File("C:/JavaFiles");
		
		System.out.println(f.isDirectory());
		
		/*
		 * String list[]  = f.list(); -> returns the files inside the directory and stores it in list
		 * 
		 * for(String x:list){S.O.P(x)} -> you can print the files like this also or you can store it in a file itself as
		 * shown below
		 */
		
		File list[]  = f.listFiles();
		
		for(File x:list)
		{
			System.out.print(x.getName() + " ");//gives name of the file
			System.out.println(x.getPath());//gives path of the file and if you just give as "x" then also it gives path
		}
	}
}

class fileClassEx1
{
	public void mehtod() throws Exception
	{
		File f = new File("C:/JavaFiles/test1.txt");
		f.setReadOnly();//if you set like this then you can only read the file but you can write it to it
		/*
		 * FileOutputStream fo = new FileOutputStream("C:/JavaFiles/test1.txt"); -> this will give an error because
		 * you have set it as readonly but you are trying to write, so it will give an error saying access denied, but 
		 * you can read
		 */
		f.setWritable(true); //-> this allows to write in the file 
		FileOutputStream fo = new FileOutputStream("C:/JavaFiles/test2.txt");
		fo.write('a');
		
		
		
	}
}

public class fileClass {
	public static void main(String[] args) throws Exception
	{
		FileClassEx fc = new FileClassEx();
		fc.method();
		
		fileClassEx1 fc1 = new fileClassEx1();
		fc1.mehtod();
	}

}
