package jabaLangPackage;

//Enum's are defined just like classes, it is a predefined finals

enum Dept
{
	CS,IS,CIVIL,ECE;//*These are all by default public static final, here we don't have
	// to assign any value, the identifier itself is a value, compiler will convert
	//these identifiers into values, 
	
	//* When you write enum it is automatically inherited from Enum class
	
	//*All these constants must be in Capital only
	
	//*Enum can have other methods as well as constructors also, and Constructors
	//should be either private or default
	private Dept()
	{
		System.out.println(this.name());//*Here all the identifiers will be called
		//because when a Enum is loaded, all the identifiers are created and their
		//constructors will be called, for each identifiers this constructor is called
		
		//* It is not called when you define the object in main class, this constructors
		// are called when this Enum is loaded
		
	}
	public void display()//constructors should be private other methods can be public
	{
		System.out.println(this.name()+ " "+this.ordinal());
	}
}

enum Dept1
{
	//enum can have other methods also, instead of writing switch block you
	//also write it like this with the identifiers itself, but when you include
	//data in identifiers then constructors should also be an parameterized constructor,
	//like even in constructor should have same set of parameters. Because
	//when enum is loaded how much identifiers are there that much time constructors
	//are called as you can see below
	CS("Faisal CS Block", 3), ECE("Ahmed EC Block",4), IS("LULU IS Block",5);
	
	String head;
	int block;
	
	private Dept1(String head, int block)
	{
		this.head = head;
		this.block = block;
	}
	
	public String getHeadName()
	{
		return this.head;
	}
	public int getBlockName()
	{
		return this.block;
	}
}

public class enumClass {
	public static void main(String [] args)
	{
		Dept d = Dept.CS;//I can't assign d=1 it is not allowed, I can use only that
		//values that are defined only in enum
		System.out.println(d.ordinal());//Gives the index of CS that is 0
		System.out.println(d.name());//Gives output as CS
		
		Dept list[]  = Dept.values();
		
		for(Dept x:list)
		{
			System.out.println(x);//gives all the constant in Dept
			
		}
		
		//Enum are most useful in switch cases shown below
		
		Dept e  = Dept.ECE;
		
		switch(e)
		{
		case ECE: System.out.println("Samaga \nElectronics block");
		         	break;
		case CIVIL: System.out.println("Lulu \nCivil block");
        			break;
		case CS: System.out.println("ashwini \ncomputer science block");
        			break;
		case IS: System.out.println("Deepika \nInformation Science block");
        			break;
		}
		
		Dept f = Dept.ECE;
		f.display();
		
		Dept1  d1 = Dept1.CS;
		
		System.out.println(d1.getBlockName());
		System.out.println(d1.getHeadName());//contructors are called when
		System.out.println(d1.name());
		//enum is loaded and every
		
			
	}

}
