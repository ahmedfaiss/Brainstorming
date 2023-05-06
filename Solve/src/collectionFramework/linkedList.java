package collectionFramework;
import java.util.*;

//Linked list has all the methods that are in arrayList plus extra methods

class usingLinkedList
{
	public void method()
	{
		
		LinkedList<Integer> l = new LinkedList<>();
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		
		for(var x:l)
		{
			System.out.println(l.getFirst());
			System.out.println(l.getLast());
		}
		
	}
}

public class linkedList {
	public static void main(String [] args)
	{
		usingLinkedList l = new usingLinkedList();
		l.method();
	}
}
