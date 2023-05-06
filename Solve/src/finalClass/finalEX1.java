package finalClass;

class finalMethod
{
	public final void display()
	{
		System.out.println("Methods can't be overridden");
	}
}

class finalMehtod1 extends finalMethod
{
	//public void display() -> is not possible
	public void show()
	{
		System.out.println("yes final methods cant be overridden");
	}
}

class finalclass
{
	public void display()
	{
		System.out.println("Final classes cant be extended");
	}
}

//class finalclass2 extends finalclass -> is not  possible

class finalclass2
{
	public void display()
	{
		System.out.println("Yes that true");
	}
}

public class finalEX1 {

}
