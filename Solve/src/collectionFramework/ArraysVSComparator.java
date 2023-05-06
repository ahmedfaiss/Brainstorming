package collectionFramework;
import java.util.Arrays;
import java.util.Comparator;

class changeMechanism implements Comparator<Integer>
{
	public int compare(Integer i1, Integer i2) {
		if(i1<i2) {
			return 1;//by default it should return -1 but we are changing the mechanism and returning 1
		}
		else if(i1>i2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}

class arrays
{
	public void method()
	{
		int a[] = {1,2,3,4,5,6,7,8};//you can also initialize with wrapper class also(Integer)
		int b[] = {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.compare(a, b));//gives 0 as all of the elements are equal and length is also same
		
		int c[] = {1,2,3,4,5,6,7};
		int d[] = {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.compare(c, d));//gives -1 as second array is larger than first, if you give firs array is larger in length than 
		//second then it will return 1
		
		int e[] = {1,2,3,4,5,6,7};
		int f[] = {2,2,3,4,5,6,7,8};
		System.out.println(Arrays.compare(e, f));//it gives -1 as first element of first array is smaller, if you give second array with smaller
		//element then it will return 1, it should not be in first element, it can be in any one of the element
		
		System.out.println();
		
		int g[]  = Arrays.copyOf(a, a.length);//gives copy of a and put the value in g
		for(int x:g){
			System.out.println(x);
		}
		
		System.out.println();
		
		Arrays.fill(g, 9);//fills g with 9 in every element
		for(int x:g){
			System.out.println(x);
		}
		
		System.out.println();
		
		Arrays.sort(a);//sorts the the array a
		for(int x:a){
			System.out.println(x);
		}
		
		System.out.println(); 
		
		int h[] = {6,2,3,5,1,4,7,8};
		System.out.println(Arrays.binarySearch(h, 5));//It is suggested to use binarySearch after sorting, this BinarySearch gives index of key
		
		//If we ant to change the mechanism of comparator then you have define it with the separate class implementing Comparator interface
		//by default java will use Comparable interface for sorting, if we want to change the mechanism of sorting then define separate class
		
		Integer i[] = {6,2,3,7,5,1,4,7,8};
		
		System.out.println(); 
		
		Arrays.sort(i, new changeMechanism());//this works only for wrapper class that is object
		for(Integer x:i){
			System.out.println(x);
		}
		
		
		
		
		
	}
}

public class ArraysVSComparator {
	public static void main(String[] args)
	{
		arrays a = new arrays();
		a.method();
	}

}
