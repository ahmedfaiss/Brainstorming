package collectionFramework;
import java.util.*;
                                          //Hashing explanation below
//hashing has many types, but common thing in hash is it used mod10 value to store the values for Ex : 15 then 15 mod 10
//that is 5 than store the value 15 in index 5, and if value is 28 then -> 28 mod 10 -> 8 -> stores the value 28 in 8.
//Suppose if you give value 35 then index will be 5 but index 5 is already taken, then in that case 35 will be loaded in
//next index of 5 that index 6.
//while searching, Suppose you search for 45 but according to mod 10  it will be present in index 5, but in index 5,
//5 is present, then you can search for next index which is index 6 with value 35, likewise you can keep on searching
//till you find null value, then If you find null value, then 45 value is not present in that table

//In hashing minimum of 25% of memory should be blank, we can only use 75% of memory only, this percentage of filling 
//is called as loading factor

//Storing a value in the next position when there is a collision is called as open addressing

//there is another concept called as chaining -> where the size and function is fixed, so when you store the key 5
//that key is not store in the table instead it is stored somewhere else with 2 nodes, 1 node is for key that is 5 and 
//other will have value null, suppose when other key 45 is also has to store in the same index then another 2 nodes will be
//created, 1 with the new value 45 and other with null value, and 2 node of key 5 which was earlier null will pointing
//towards key 45, likewise it keeps on creating 2 nodes if value has to be stored in same index, and table will be
//pointing towards key 5.

//usually java class has the size 16 and based upon the situation the size increases


class hashSet
{
	public void method()
	{
		HashSet<Integer> h = new HashSet<>(20, 0.75f);//20 is space and we can use 75% of space, If we increase our usage
		//then space will increase but 25% memory will be free. It is not necessary to give capacity, if we dont give also
		//it works 
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(10);//duplicates are not allowed in set, it will be automatically rejected
		//the value will not be in same order as we give, it will change
		
		System.out.println(h);
	}
}
public class usingHashSet {
	public static void main(String[] args)
	{
		hashSet h = new hashSet();
		h.method();
	}

}
