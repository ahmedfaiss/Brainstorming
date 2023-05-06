package Generics;

class data<T>
{
	private T obj;
	
	public void setdata(T  v)
	{
		obj = v;
	}
	
	public T getdata()
	{
		return obj;
	}
}
@SuppressWarnings("Unchecked")
class array<T>
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

public class StudentChallenge1 {
	public static void main(String[] args)
	{
		data<String> d = new data<>();//takes String as an object
		
		d.setdata("Faisal");
		
		System.out.println(d.getdata());
		
		array<Integer> a = new array<>();//takes Int as an object, you can also change the object to String also
		a.append(10);
		a.append(10);
		a.append(30);
		
		a.display();
		
		/*
		 * you can also give String object like i shown below
		 * 
		 * array<String> a = new array<>();
		a.append("sfkj");
		a.append("dvgvh");
		a.append("jv");
		 * 
		 */
	}

}
