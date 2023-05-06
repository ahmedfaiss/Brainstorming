package Object_oriented_Progrramming;

class Male
{
	 double body;
	 String hair;
	 String sound;
	 
	 public double figure()
	 {
		 return body;
	 }
	 
	 public String voice()
	 {
		 return sound;
	 }
	
}

class faisal extends Male
{
	public double height()
	{
		return body;
	}
}



public class Inheritance {
	public static void main(String [] args)
	{
		faisal f = new faisal();
		f.body = 29.87;
		
		System.out.println(f.figure());
	}
}
