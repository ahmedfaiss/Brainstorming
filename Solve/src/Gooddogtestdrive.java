

class Gooddog{

		private int size;
		
		public int getsize()
		{
			return size;
		}
		public void setsize(int z)
		{
			size = z;
		}
		
		void bark()
		{
			if(size > 60)
			{
				System.out.println("woof,woof");
			}
			else if(size > 14)
			{
				System.out.println("ruff,ruff");
			}
			else
			{
				System.out.println("meow,meow");
			}
		
	}
}

public class Gooddogtestdrive {
	
	public static void main(String [] args)
	{
		Gooddog Dog = new Gooddog();
		Dog.setsize(16);
		Dog.bark();
		Dog.setsize(61);
		Dog.bark();
		Dog.setsize(13);
		Dog.bark();
		
	
	
	}

	
}
