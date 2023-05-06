
public class Hobbit {
	String Name;
	public static void main(String [] args)
	{
		Hobbit [] h = new Hobbit[3];
		int z = 0;
		
		while(z<3)
		{
			
			h[z] = new Hobbit();
			h[z].Name = "Bilbo";
			
			if(z==1)
			{
				h[z].Name = "Faisal";
			}
			if(z==2)
			{
				h[z].Name = "faisal2";
			}
			
			System.out.println(h[z].Name + " is a good hobbit name");
			z += 1;
		}
	}

}
