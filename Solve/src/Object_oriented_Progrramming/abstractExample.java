package Object_oriented_Progrramming;

abstract class shape
{
	
	public void hello()
	{
		System.out.println("HI");
	}
	
	abstract public void perimeter();
	abstract public void area();
	
}

class Rectangle extends shape//should define every abstract method of super class

{
	double r;
	
	public void setvalue(double r)
	{
		this.r =r;
	}
	
	public void perimeter()
	{
		System.out.println("{Perimeter of a rectangle " +2*Math.PI*r);
	}
	public void area()
	{
		System.out.println("Area of a Rectangle" +Math.PI*r*r);
	}
}

class circle extends Rectangle
{
	circle()
	{
		super.r = r;
	}
	public void perimeter()
	{
		//super.r = 34.4;//sets the r variable -> either you can give in main class or here
		System.out.println("Perimeter of a circle" + 2*Math.PI*r);
	}
	public void area()
	{
		System.out.println("Area of a Circle " +Math.PI*r*r);
	}
}


public class abstractExample {
	
	public static void main(String [] args)
	{
		
		
		Rectangle r = new Rectangle();
		r.setvalue(41.4);
		r.perimeter();
		r.area();
		r.hello();
		
		circle c = new circle();
		c.setvalue(41.4);
		c.perimeter();
		c.area();
		
		
		
	}

}
