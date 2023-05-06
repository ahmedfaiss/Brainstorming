
public class Testarray {
	
	public static void main(String [] args)
	{
		int [] index = new int [4];
		String [] island = new String[4];
		
		island[0] = "Bermuda";
		island[1] = "feji";
		island[2] = "azores";
		island[3] = "cozmules";
		
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		
		int y = 0;
		
		int ref = 0;
		while(y<4)
		{
			ref = index[y];
			
			System.out.println("island = "+island[ref]);
			
			y=y+1;
		}
		
	}

}
