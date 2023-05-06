package collectionFramework;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

//Treeset implements sortedset, collection, comparator, comparable

class treeSet
{
	public void method()
	{
		TreeSet<Integer> t = new TreeSet<>(List.of(10,20,30,60,70));//set is in order and can't have duplicates
		
		t.add(60);//duplicates can't be added
		System.out.println(t.ceiling(30));//it gives value which is greater or equal to, Suppose if you give 50 then 60
		//will be the output because it returns equal value or nearest greater
		
		System.out.println(t.floor(25));//floor is opposite of ceiling, this gives equal or lesser value, here the value
		//will be 20
		
	//also you can use reference of parent interface and use only methods that are available in parent interface as shown
		
		Collection<Integer> c = new TreeSet<>();//you can use method of collection interface only
		
	}
}

public class usingTreeSet {
	public static void main(String[] args)
	{
		treeSet t = new treeSet();
		t.method();
	}

}
