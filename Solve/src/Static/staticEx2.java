package Static;
class Test
{
	static
	{
		System.out.println("Block1");
	}
	static
	{
		System.out.println("Block2");
	}
}
public class staticEx2 {
	public static void main(String [] args)
	{
		System.out.println("Main");
		Test t = new Test();//by just initializing the class static block will be 
		                    // executed
	}

}
