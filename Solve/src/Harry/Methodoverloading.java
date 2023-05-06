package Harry;



public class Methodoverloading {
	
	static void fo()
	{
		System.out.println("hello");
	}
	
	static void fo(int s)
	{
		System.out.println("hello1");
	}
	
	// two or more methods having same name but different parameters
	public static void main(String [] args)
	{
	 
	 
	Methodoverloading M  = new Methodoverloading();
	M.fo();
	M.fo(5);
	
	
	}
}



