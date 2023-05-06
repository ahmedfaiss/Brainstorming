package collectionFramework;
import java.util.TreeSet;

//when we use objects of our own class we have to use comparable interface, otherwise java doesn't know how to order
//the methods or values you have given

class Point implements Comparable
{
	int x,y;
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()//this method prints the value present in the memory
	{
		return "X = "+x +" y = "+y;
	}
	
	public int compareTo(Object o)//this method is from Comparable we have to implement it 
	{
		Point p = (Point) o; //type casting object to Point, we can't  give directly in the parameter, So we have to typecast it
		
		if(this.x < p.x)//here this.x is the value we gave now, but p.x is value we gave before, So when only one is given
			//then java assigns it in first space, but when you give second points then java compares using this method.
			//here smaller value should occupy the first place, that's why we return -1. 
		{
			return -1;
		}
		else if(this.x > p.y)
		{
			return 1;
		}
		else
		{
			if(this.y < p.y)
			{
				return -1;
			}
			else if(this.y > p.y)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
	}
}

public class comparableInterface {
	public static void main(String[] args)
	{
		TreeSet<Point> t = new TreeSet<>();
		
		Point p = new Point(4,4);
		
		t.add(new Point(4,3));
		t.add(new Point(3,2));
		t.add(p);//you can also pass like by creating the object separately
		
        System.out.println(t);//prints everything in the memory
		
	}

}
