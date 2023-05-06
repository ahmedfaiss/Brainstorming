


public class Gameguess {
	public static void main(String []args)
	{
		
		Game g = new Game();
		g.guess();
	}

}

class Game{
	
	public void guess()
		{
			String []virtual = new String[7];
			
			virtual[0] = null;
			virtual[1] = null;
			virtual[2] = null;
			
			virtual[3] = "pe";
			virtual[4] = "t.c";
			virtual[5] = "om";
			
			virtual[6] = null;
			
			int number;
			
			while(true)
			{
				number = (int) (((Math.random()*10)-3));
				if(number > 0)
				{
				
					if(virtual[number] == "om")
					{
						System.out.println(number + " wow that's a kill");
						break;
					}
					else 
					{
						if(virtual[number] == "pe")
						{
							System.out.println(number + " that's a hit, guess one more time");
						}
						else if(virtual[number] == "t.c")
						{
							System.out.println(number + " that's a hit, guess one more time");
						}
						else
						{
							System.out.println(number +" guess one more time");
						}
					}
				}
				else
				{
					continue;
				}
				
			}
			
	
		}
}




