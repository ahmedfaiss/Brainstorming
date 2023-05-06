package Generics;

class A{}


class array10<T extends Number>//either it can be class or interface still you have to write it as extended, there is no
//implementing in generic
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

public class boundsOfGeneric {
	public static void main(String[] args)
	{
		//array10<String> a10 = new array10<>(); gives an error because generic is extending Number, So either it should 
		//be Float, Double, Short etc..
		
		array10<Double> a10 = new array10<>();//data type should be Number 
		
		a10.append(15.9);
		
		a10.display();
	}

}
