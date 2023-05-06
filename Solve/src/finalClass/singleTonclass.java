package finalClass;
/* 
 * singleTon class can be accessible only once
 */

class coffeemachine
{
	static private coffeemachine my = null ;
	private double waterqty;
	private int coffepowder;
	private double milk;
	
	private coffeemachine()
	{
		waterqty = 1;
		coffepowder =1;
		milk =1;
	}
	public void waterqty(double water)
	{
		waterqty = water;
	}
	
	public void coffepowder(int powder)
	{
		coffepowder = powder;
	}
	
	public void milk(double milk)
	{
		this.milk = milk;
	}
	
	public double getcoffe()
	{
		return 0.15*(waterqty+coffepowder+milk);
	}
	
	static coffeemachine getInstance()
	{
		if(my == null)
		{
			my = new coffeemachine();
		}
		return my;
	}
	
}
public class singleTonclass {
	
	public static void main(String [] args)
	{
		coffeemachine c1 = coffeemachine.getInstance();
		coffeemachine c2 = coffeemachine.getInstance();
		coffeemachine c3 = coffeemachine.getInstance();
		
		System.out.println(c1+" "+c2+" "+c3);
	}

}
