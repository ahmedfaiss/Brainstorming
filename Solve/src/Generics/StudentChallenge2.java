package Generics;


class array1<T>
{
	T data[] = (T[]) new Object[10];
	int length = 0;
	
	public void append(T v)
	{
		data[length++] = v;
	}
	
	public void display()
	{
		for(int i = 0 ; i<length ; i++)
		{
			System.out.println(data[i]);
		}
	}
}


public class StudentChallenge2 {
	public static void main(String [] args)
	{
		array1 a = new array1();//If you don't mention any data type the java considers it as Object generic and you can 
		//give any datatype value as shown below
		
		a.append("Hello");
		a.append("Hi");
		a.append(30);//java itself will do auto boxing
		a.append(new Integer(10));//Either you can give like this or you can directly give value
		
		a.display();
		
	}

}
