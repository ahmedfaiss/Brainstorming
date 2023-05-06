import java.util.*;

class op
{
	public int[] rotate(int[] arr)
	{
		if(arr.length % 2 ==0)
		{
			int j = arr.length-1;
			for(int i = 0; i <arr.length/2 ; i++)
			{
				int store = arr[i];
				
				
				int store1 = arr[j];
				
				
				
				
				arr[i] = store1;
				arr[j] = store;
				j--;
				
				
			}
		}
		
		else
		{
			int j = arr.length-1;
			for(int i = 0; i<(arr.length-1)/2 ; i++)
			{
				int store = arr[i];
				int store1 = arr[j];
				
				arr[i] = store1;
				arr[j] = store;
				j--;
			}

		}
		
	    for(int i =0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		return arr;
	}
}

public class arrrotation {
	
	
	public static void main(String [] args)
	{
		op o = new op();
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the length of an array ");
		
		int n = s.nextInt();
		
		int [] arr = new int[n];
		
		System.out.print("Enter the array of value "+ n);
		
		for(int i=0; i<n; i++)
		{
			arr[i] = s.nextInt();
		}
		
		
		  o.rotate(arr);
		
		
	}

}
