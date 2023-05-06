
public class CiscoExam {
	
	public static void main(String[] args)
	{
		int arr[][]= {{3,2,1}, {7,8,9}, {5,6,7}, {4,5,11}};
		
		int num = arr[0][0];
		int num1 = 0;
		int column = 0, row = 0;
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				if(arr[i][j]<num)
				{
					num = arr[i][j];
					column = j;
					row = i;
					num1 = arr[i][j];
				}
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(i!= row && arr[i][column]>num1)
			{
				num1 = arr[i][column];
			}
		}
		
		System.out.println(num+" "+num1);
	}
	
}


