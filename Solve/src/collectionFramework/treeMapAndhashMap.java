package collectionFramework;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Treeset uses logn time but hashmap uses constant time 
//TreeSet will store in order wise but HashMap will not store in order Wise
//HashMap will have loading factor but treeset doesn't have that

class treeMap
{
	public void method()
	{
		TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0,"A",1,"B",2,"C"));//you can give inside this by using as Map.of
		//but in arrayList you have to pass a List.of.
		
		tm.put(3, "D");//here you have to use put instead of add method
		
		tm.put(4,"E");
		
		System.out.println("\nPrinting the vlaues methods of TreeMap \n");
		
		System.out.println(tm.ceilingEntry(4));//gives value which is present, of that value corresponding to the key
		//is not present then next bigger key will be searched and gives that output,this gives key as well as value
		
		System.out.println(tm.ceilingEntry(3).getValue());//this gives output that is only value
		
		System.out.println(tm.get(4));//gives E as output
		
		//you can use Entry collection that has some more methods that TreeMap as shown below
		
		Entry<Integer, String> e = tm.firstEntry();//there are many methods present in Entry you can use that using like this
		
		System.out.println(e.getKey()+"  "+e.getValue());
		
		Entry<Integer, String> e1 = tm.floorEntry(4);
		
		System.out.println(e1.getValue()+" "+e1.getKey());	
		
		System.out.println(tm);
		
	}
}


class hashMap
{//here we can't guarantee that the values will stored in order
	public void method()
	{
		HashMap<Integer, String> h = new HashMap<>(Map.of(1,"A",2,"B",3,"C"));
		
		h.put(4, "D");
		
		System.out.println("\nPrinting the methods of HashMap\n");
		
		
		System.out.println(h);
		
		
	}
}
public class treeMapAndhashMap {
	public static void main(String[] args)
	{
		treeMap t = new treeMap();
		t.method();
		
		hashMap h = new hashMap();
		h.method();
	}

}
