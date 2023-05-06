package collectionFramework;
import java.util.Enumeration;
import java.util.Hashtable;


//Hash table is legacy version it is not suggested to use, this can be used with generic or withouth generic will show below 

class hashTable
{
	public void method()
	{
		System.out.println("\n This is using the Hash Table without generic");
		
		Hashtable h = new Hashtable();
		h.put(1, "H");
		h.put(2, "I");
		h.put(3, "J");
		h.put(4, "K");//duplicates are allowed because we are using the key
		
		Enumeration e = h.elements();
		
		while(e.hasMoreElements())//This is similar to hasNext() method
		{
			System.out.println(e.nextElement());//this is similar to next() method
		}
		
		System.out.println("\n This is HashTable with generic ");
		
		Hashtable<Integer,String> hg = new Hashtable<>();
		
		hg.put(5, "F");
		hg.put(6, "g");
		hg.put(7, "F");
		hg.put(8, "g");
		//hg.put(7, "d");//duplicate key will not be stored
		//hg.put(8, "l");
		
		hg.compute(7, (k,v)->(v+"AD"));//AD will be added to F so output will be FAD, this method allows us to to that
		
		hg.computeIfAbsent(10, (k)->k+"CV");//you can see 10 is not initialized, so this method created the key 10 and assigns the value "7CV" to it
		
		//iterator is not available for this so you can use enumeration
		
		Enumeration e1 = hg.elements();
		
		while(e1.hasMoreElements())//This is similar to hasNext() method
		{
			System.out.println(e1.nextElement());//this is similar to next() method
		}
		
		//If you want key with valie then you can directly print using "hg"
		
		System.out.println("\n Printin the key and value");
		
		System.out.println(hg);
		
	}
}
public class usingHashTable {
	public static void main(String []args)
	{
		hashTable h = new hashTable();
		h.method();
	}

}
