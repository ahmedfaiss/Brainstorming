package Object_oriented_Progrramming;

class Soopper
{
	public void display()//same method but with different class overriding can be achieved
	{
		System.out.println("Super Class");
	}
}

class Suub extends Soopper
{
	public void display()//Method overriding -> Run time polymorphism
	{
		System.out.println("Sub Class");
	}
}

public class dynamicMethod {
	public void main(String [] args)
	{
		Soopper s =  new Soopper();
		s.display();//Displays Super class method
		Suub  sb = new Suub();
		sb.display();//Displays sub class method
	}
}
/*If 1 alphabet of method in either of the class is changed then overriding can't
 *  be achieved. Even the return type should remain same.
 *  return type can be different only if the return types are class object
 *  For EX : class A{}
 *  class B extends A{} -> then in Soopper class ->public A display()
 *  {return new A()} -> and in sub class -> public B display(){return new B()}
 *  can be achieved -> here return types are class objects of super (i,e class A)
 *  and sub class (i,e class B)*/
