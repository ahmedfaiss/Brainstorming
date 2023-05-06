import java.util.*;
public class Dotcom 
{
	
	public static void main(String [] args)
	{
		
		Simpledotcom simp = new Simpledotcom();
		int [] locations = {2,3,4};
		simp.setlocationcells(locations);
		
		int numberofguess = 0;
		
		
		
		while(true)
		{
			
			Scanner sc = new Scanner(System.in);
			System.out.print("enter a number ");
			String input =  sc.next();
			String result = simp.checkyourself(input);
			
			numberofguess++;
			
			if(result == "kill")
			{
				
				break;
				
			}
			
			else
			{
				
				continue;
			}
			
		}
		
		if(numberofguess > 3)
		{
			
			System.out.println("You took "+numberofguess+" guess");
		}
		
		
		
	}

}


class Simpledotcom
{
	int [] locationcells;
	int numberofhits = 0;
	
	public void setlocationcells(int [] locs)
	{
		
		locationcells = locs;
		
	}
	
	public String checkyourself(String stringguess)
	{
		
		int guess = Integer.parseInt(stringguess);
		String result = "miss";
		
		for(int cell : locationcells)
		{
			
			if(guess == cell)
			{
				
				result = "hit";
				numberofhits++;
				break;
						
			}
		}
		
		if(numberofhits == locationcells.length)
		{
			
			result = "kill";
			
		}
		
		System.out.println(result);
		return result;
		
		
	}
}
