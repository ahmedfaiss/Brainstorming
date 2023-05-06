package collectionFramework;

import java.util.*;

class usingDeque
{
	public void method()
	{
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		
		dq.offerLast(10);
		dq.offerLast(20);
		dq.offerLast(30);
		dq.offerLast(40);//adds at the last, how it is dependent on compiler
		
		System.out.println("Printing the last added integers\n");
		
		dq.forEach((x)-> System.out.println(x));
		
		dq.offerFirst(1);
		dq.offerFirst(2);
		dq.offerFirst(3);
		dq.offerFirst(4);//adds to the first position
		
		//you can use addfirst or addlast or removefirst or removelast but if you use that you have handle exception
		//but offer and poll does the same job with exception free
		
		dq.pollFirst();
		dq.pollFirst();
		dq.pollFirst();
		dq.pollLast();
		dq.pollLast();
		
		System.out.println("\nPrinting the all the data after deleting first \n");
		
		Iterator<Integer> i = dq.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}
}

public class Deque {
	public static void main(String[] args)
	{
		usingDeque u = new usingDeque();
		u.method();
		
	}

}
