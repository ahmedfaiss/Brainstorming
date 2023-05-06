package javaIOStreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Serialization is a process of a storing the state of an object and retrieving the object
//we can retrieve the object by using ObjectInputStream and also we can put object to a file

class Student2 implements Serializable//we can achieve serialization by implementing serialization or else ObjectStream wont be possible
//This 'Serializable' interface does not have any methods inside it.
//Default constructors should be there in the serialzable class, if no constructors written then by default compiler will
//assign a constructor as we all know that
//And also if  parameterized constructor is used then default constructor should be written or else it wont be possible
//to read the data but writing can be done

//Static and transient data will not be stored in the source by ObjectStream, So if any data that you dont want to
//write in a file then you can write inside a static block

{
	int rollNo;
	String Name;
	float Avg;
	String Dept;
	public static int data;
	transient int data1;//These data wont store in the file
	
	public Student2() {} //This is dummy constructor, even though it is not necessary but its a good practice to write it
	//If It is a parent class  then its mandatory to write it
	//If you write parameterized constructor then it is necessary to write default constructor because you wont be able to
	//deserialize the data
	
	public Student2(int r, String n, float a, String d)
	{
		rollNo = r;
		Name = n;
		Avg = a;
		Dept =d;
		data = 100;
		data1 = 200;//this data wont be updated while deserialization because this value is not stored in the file
		//So if we print this then the value will be 0 as we didn't initialize value while declaring it
		
	}//This parameterized constructor is also not necessary but we can use this to assign values
	
	public String toString()
	{
		return "RollNo " + rollNo + "  Name " + Name +"  Average " + Avg + "  Department" + Dept + "  data "+data+
				"  data1 " + data1;
	}
	
	
}

class objectOutputStream
{
	public void methood() throws Exception
	{
		FileOutputStream fos = new FileOutputStream("C:/JavaFiles/Serialization.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student2 s = new Student2(10, "Faisal", 45.4f, "ECE");
		
		oos.writeObject(s);
		
		fos.close();
		oos.close();
		
	}
}

class objectInputStream
{
	public void method() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:/JavaFiles/Serialization.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student2 s  = (Student2) ois.readObject();//we have to typecast it orelse it will give an error because it should
		//be known what object it is
		
		System.out.println(s);
		
		fis.close();
		ois.close();
	}
}
public class Serialization {
	public static void main(String[] args) throws Exception
	{
		objectOutputStream oos = new objectOutputStream();
		oos.methood();
		
		objectInputStream ois = new objectInputStream();
		ois.method();
		
		//every class there is a serial version given by the Jvm so when ever you try to remove default constructor
		//then the serial value will not match, so it gives an error, if you declared the parametrized constructor only
		//o relse it wont be a problem
	}

}
