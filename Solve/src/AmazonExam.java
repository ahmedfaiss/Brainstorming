import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AmazonExam { 
	public static void main(String[] args)
	{
		int arr[] = {1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 7, 9, 9, 9, 8, 8};
		
		
		ArrayList<Integer> a = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());//To convert Array to ArrayList
		
		List<Integer> a1 = a.stream().distinct().toList();
		Iterator<Integer> it = a1.iterator();
		
		while(it.hasNext())
		{
			
			int num = it.next(), k=0;
			for(int i = 0 ; i<arr.length ; i++)
			{
				if(num == arr[i])
				{
					k++;
				}
			}
			System.out.println(num +" = "+k);
		}		
	}

}
