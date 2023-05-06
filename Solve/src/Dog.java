
public class Dog {

	String name;
	public static void main(String[] args)
	{
		String Name;
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Tommy";
		
		Dog [] mydogs = new Dog[3];
		mydogs[0] = new Dog();
		mydogs[1] = new Dog();
		mydogs[2] = dog1;
		
		mydogs[1].name = "Tommy1";
		Name = mydogs[1].name;
		mydogs[0].name = "Tommy0";
		Name = mydogs[1].name;
		
		System.out.println("the name of my first dog is" + mydogs[0].name);
		
		int x= 0;
		while(x<mydogs.length)
		{
			mydogs[x].bark();
			System.out.println(mydogs[x].name);
			mydogs[x].eat();
			x +=1;
		}
		
		
	}
	
	public void bark()
	{
		System.out.println(name +"Bow bow bow");
	}
	public void eat()
	{
		System.out.println(name + "eating");
	}
}
