package Generics;

//Wild card can be used only when you use other objects in the arguments

class array13<T>
{
	
	T data[] = (T[]) new Object();
	int length = 0;
	
	public void setdata(T v)
	{
		data[length++] = v;
	}
	
	public void display()
	{
		for(int i=0; i<length ; i++)
		{
			System.out.println(data[i]);
		}
	}
	
}



class method3
{
	public void method(array13<?> list)//this is called  as Wild card
	{
		list.display();
	}
	public void method1(array13<? extends Number> list)//this is called  as Wild card with Upper bound that is it can have
	//object that is extending from Number
	{
		list.display();
	}
	
	public void method2(array13<? super Number> list)
	{
		list.display();
	}
}



public class wildCard {
	public static void main(String [] args)
	{
		array13<String> a13 = new array13<>();
		
		a13.setdata("Hello");
		a13.setdata("Hello1");
		a13.setdata("Hello2");
		
		array13<Integer> a14 = new array13<>();
		
		a14.setdata(10);
		a14.setdata(20);
		a14.setdata(30);
		
		method3 m3 = new method3();
		
		m3.method(a14);//can have any types of Object because there is no bounds for this method
		
		m3.method1(a14);//can have Object that is subclass of Number - Bytes, Float, Double
		
		//m3.method2(a14); If you give like this it will throw an error because it is lower bound so should give only 
		//values that is a parent class or defined class
		
		
	}

}
