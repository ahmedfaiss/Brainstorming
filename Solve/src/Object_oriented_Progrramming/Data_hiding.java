package Object_oriented_Progrramming;

class hide
{
	private int length;
	private int breadth;
	
	public int getlength()
	{
		return length;
	}
	public void setlength(int l)
	{
		if(l>0)
		{
			length = l;
		}
		else
		{
			length =0;
		}

	}
	
	public int getbreadth()
	{
		return breadth;
	}
	public void setbreadth(int l)
	{
		if(l>0)
		{
			breadth = l;
		}
		else
		{
			breadth =0;
		}

	}
	
	public void area()
	{
		System.out.println(length * breadth);
	}
	
	
}

public class Data_hiding {
	
	public static void main(String args[])
	{
		hide h = new hide();
		
		h.setlength(4);
		h.setbreadth(4);
		
		h.area();
	}

}
