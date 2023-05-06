package javaIOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class ConsumerEx implements Serializable
{
	String Id;
	String Name;
	String Phone;
	
	static int count =1;
	
	public ConsumerEx() {} //This has to be written if you are writing parameterized constructor
	
	public ConsumerEx(String n, String p)
	{
		Id ="IC"+count;//Assigns unique Id value 
		count++;
		Name =n;
		Phone =p;
	}
	
	public String toString()
	{
		return "ID : "+ Id + "\nName : " + Name + "\nPhone : "+Phone;
	}
	
}

class consumerWrite
{
	public void method() throws Exception
	{
		FileOutputStream fos = new FileOutputStream("C:/JavaFiles/student_Challenge1.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//Creating the array of class
		ConsumerEx list[]  = {new ConsumerEx("Faisal","9741090600"), new ConsumerEx("Ahmed", "9035636850"),  new ConsumerEx("Lulu", "6366089904")};
		
		oos.writeInt(list.length);//at first writing the length so that while reading we will know how  much objects are
		//present
		
		for(ConsumerEx x:list)
		{
			oos.writeObject(x);//writing the object to a file using objectOuputStream
		}
		
		oos.close();
		fos.close();
	}
}

class consumerRead
{
	public void method() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:/JavaFiles/student_Challenge1.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ConsumerEx list[] = new ConsumerEx[ois.readInt()];//reading the first input as it is length of the object
		
		for(int i=0; i<list.length; i++)
		{
			list[i] = (ConsumerEx)ois.readObject();//storing the object in the array from file
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name : ");//taking the name to be printed
		String input = sc.nextLine();
		
		for(int i=0; i<list.length ; i++)
		{
			if(input.equalsIgnoreCase(list[i].Name))//comparing the name entered with the object name, If present then
				//print that object
			{
				System.out.println(list[i]);//this calls toString method of a ConsumerEx class
			}
		}
	}
}



public class studentChallenge1 {
	public static void main(String[] args) throws Exception
	{
		consumerWrite cw = new consumerWrite();
		cw.method();
		
		consumerRead cr = new consumerRead();
		cr.method();
	}

}
