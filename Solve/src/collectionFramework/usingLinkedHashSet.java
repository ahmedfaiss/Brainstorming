package collectionFramework;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.HashSet;

//The difference between linked hash map and linked hash set is that in liked hash map both key and values are used but in linked hash set only
//values are used
//The difference between linked hash set and hash set is that linked hash set will not the be stored in sorted order nut hash set follows the sorted
//set

class linkedHashSet
{
	public void method()
	{
		LinkedHashSet<String> lh = new LinkedHashSet<>(10);//10 is just initializing the intial size
		
		lh.add("Hello");
		lh.add("Hello1");
		lh.add("Hello2");
		
		Iterator<String> it = lh.iterator();//import iterator
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}

public class usingLinkedHashSet {
	public static void main (String[] args)
	{
		linkedHashSet l = new linkedHashSet();;
		l.method();
	}

}
