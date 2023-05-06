import java.util.*;

public class twodarray {
	
	public static void main(String ars[])
	{
		int [][] a = new int[3][];
		a[0] = new int[5];
		a[1] = new int[6];
		a[2] = new int[7];
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				a[i][j] = s.nextInt(); 
				
			}
		}
		
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(y +" ");
			}
		}
	}

}
