package Generics;

class array3<T>
{
	T data[]  = (T[]) new Object[10];
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

class array4 extends array3
{
	
}

class array5<T>
{
	T data[]  = (T[]) new Object[10];
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

class array6 extends array5<String>
{
	
}

class array7<T>
{
	T data[]  = (T[]) new Object[10];
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

class array8<T> extends array7<T>//If you define here as <T> in parent class then in sub class also you have define as <T>
//or else it will show an error
{
	
}

public class inheritingGeneric {
	public static void main(String [] args)
	{
		array4 a4 = new array4();//If you initialize like this then you can pass any data types as it array3 takes as 
		//data types as Object
		
		//here in array6 class in extending generic class which is String
		array6 a6 = new array6(); //you can pass only Strings because parent generic class is defined as String
		a6.append("sdfhk");
		a6.append("skf");
		a6.display();
		
		//This is for separate class where it defined as <T> in array7, So array8 should also be defind as <T>
		
		array8<Integer> a8 = new array8<>();//you can define any data type here because you have given as <T> in class
		a8.append(10);
		a8.append(20);
		a8.display();
		
		
		
		
	}

}
