import java.util.*;

public class sumofarr {
	
	public static void main(String[] args)
	{
		ope o = new ope();
		
		Scanner s = new Scanner(System.in);
		int [] arr  = new int[6];
		int sum, search, max, min;
		
		System.out.println("Enter an array of length 6" );
		
		for(int i = 0; i <6; i++)
		{
			arr[i] = s.nextInt();
		}
		
		
		System.out.println("Enter the value for search");
		
		int searchval = s.nextInt();
		
		
		
		System.out.println("The sum of an array is " + (sum = o.sum(arr)));
		
		search = o.search(arr,searchval);
		
		if(search == 0)
		{
			System.out.println("The element you serched is not available in the array " + (search));
			
		}
		else
		{
			System.out.println("The index of searched array is " + (search));
		}
		
		
		
		System.out.println("The maximun value in an array is " + (max = o.max(arr)));
		
		System.out.println("The minimum value in an array is " + (min = o.min(arr)));
		
		
		
		
	}
	
	

}


class ope{
	
	public int sum(int[] arr)
	{
		int sum = 0;
		for(int i = 0; i<arr.length; i++)
		{
			sum += arr[i];
		}
		
		return sum;
		
	}
	
	public int search(int[] arr, int val)
	{
		int search = 0;
		
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == val)
			{
				search = i;
				
			}
			
		}
		
		return search;
		
	}
	
	public int max(int[] arr)
	{
		int maxval = arr[0];
		for(int i = 1; i<arr.length; i++)
		{
			if(arr[i] > maxval)
			{
				maxval = arr[i];
			}
		}
		return maxval;
	}
	
	public int min(int[] arr)
	{
		int minval = arr[0];
		for(int i = 1; i<arr.length; i++)
		{
			if(arr[i] < minval)
			{
				minval = arr[i];
			}
		}
		
		return minval;
	}
}