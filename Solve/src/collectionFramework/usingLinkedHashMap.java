package collectionFramework;
import java.util.LinkedHashMap;
import java.util.Map;

//Linked Hash Map will have address of previous and next value, if only one value then , next and prevoius will be null
//If has more values then, last value's next will be null
//linkedhashMap stores values in order but hash map will not do that
//Linked HashMap will have key and value
//In linkedHashMap if you limit the size to 10, then if you insert 11th value, then size is overloaded, then 11th value
//will be stored by removing the first value
//you can change the order of the key's based on the by access of the key, for initial access of the key's as shown first
//for least access key's will be shown at the last
//So in the above case when you cross the limit of the size then least access keys are deleted first
//time taken by the linkedhashmap is constant

// order access is based on insertion or accessing

class linkedHashMap
{
	public void method()
	{
		LinkedHashMap<Integer, String> lmh = new LinkedHashMap<>(5,0.75f);//5 is the initial size but its not limit, when you
		//insert more than 5, then size will increase, 0.75f is the maximum memory allocation 
		lmh.put(1, "A");
		lmh.put(2, "B");
		lmh.put(3, "C");
		lmh.put(4, "D");
		lmh.put(5, "E");//this values will be stored in the order we give but not in sorted order
		
		lmh.forEach((k,v)-> System.out.println(k +"  " + v));
		
		//maintaining order based on the access
		
		LinkedHashMap<Integer, String> lmh1 = new LinkedHashMap<>(5,0.75f,true);//5 is the initial size but its not limit, when you
		//insert more than 5, then size will increase, 0.75f is the maximum memory allocation, "true" is to say that maintain in access order
		lmh1.put(1, "A");
		lmh1.put(2, "B");
		lmh1.put(3, "C");
		lmh1.put(4, "D");
		lmh1.put(5, "E");
		lmh1.put(6, "A");//duplicates is allowed
		
		String s = lmh1.get(1);
		s = lmh1.get(5);//you can see that 1 and 5 will be the stored in last, so when you overload the size first value will be deleted
		
		
		System.out.println("\n Printing by maintaining the access order");

		lmh1.forEach((k,v)-> System.out.println(k +"  " + v));
		
		//by giving the limit
		
		LinkedHashMap<Integer, String> lmh2 = new LinkedHashMap<>(5,0.75f,true){
			
			protected boolean removeEldestEntry(Map.Entry e)//this the method you have to override to limit the size to 5 or above
			{
				return size()>5;
			}
			
		};//5 is the initial size but its not limit, when you insert more than 5, then size will increase, 0.75f is the maximum memory allocation,
		//"true" is to say that maintain in access order
		lmh2.put(1, "A");
		lmh2.put(2, "B");
		lmh2.put(3, "C");
		lmh2.put(4, "D");
		lmh2.put(5, "E");
		lmh2.put(6, "A");//if I insert here itself, that is before accessing then top will be deleted, so now only 5 are there from key 2 to 6
		
		//now I have given as true, so it will maintain the order in the form of access
		
		String s1 = lmh2.get(5);//now 5 will move to last to maintain access order
		
		s1 = lmh2.get(1);//I can't access this because it is already deleted
		
		lmh2.put(7, "G");//this will be the last one in memory and 2 will be deleted now as that is the least eldest accessed value
		
		System.out.println("\n printing the values after limiting the size");
		
		lmh2.forEach((k,v)->System.out.println(k +"  "+ v));
		
		
		
	}
}


public class usingLinkedHashMap {
	public static void main(String[] args)
	{
		linkedHashMap l = new linkedHashMap();
		l.method();
	}

}
