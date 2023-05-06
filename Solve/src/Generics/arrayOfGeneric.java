package Generics;

class Example
{
	public void method()
	{
		Object obj[] = new Object[3];
		
		obj[0] = "Hi";
		obj[1] = "Hello";
		obj[2] = 10;//Object class can take any datatype value but if you print  it by typecasting then it will throw an
		//error
		
		for(int i=0 ; i<3; i++)
		{
			System.out.println(obj[i]);//If you give value like this for Object then it will print but if you typecast
			//then it will throw an error
		}
	}
}

class Example1<T>//class should be of generic
{
	
		T data[] = (T[]) new Object[3];
}

public class arrayOfGeneric {
	
	public static void main(String [] args)
	{
		Example e = new Example();
		e.method();
		Example1<String> e1 =  new Example1();
		e1.data[0] = "Hi";
		e1.data[1] = "Bye";
		e1.data[2] = "hello";
		
		String str = e1.data[0];//you don't have to type cast when you assign values, and it will throw an error when you
		//assign other values other than String, but in Object class you can define any type of objects there wont be any
		//error till you run, but in here it will show an error at compile time itself
		
		

		
	}

}
