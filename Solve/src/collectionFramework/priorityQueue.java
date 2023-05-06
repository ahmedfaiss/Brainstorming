package collectionFramework;

import java.util.*;

// PriorityQueue uses Heap methodology that is highest priority value will be the top(which is the smallest in value)
//it is like a tree smallest value will be in the top and when the smaller value than previous one is given then the lastest
//smaller value is updated in the top, (remember Binary tree, when you look back to this you should remember what is binary
//tree that we watched in the video explain by khalid sir)



class usingPriorityQueue
{
	public void method()
	{
		PriorityQueue<Integer> p = new PriorityQueue<>();
		
		p.add(30);
		p.add(40);
		p.add(20);
		p.add(10);
		p.add(5);
		p.add(3);
		
		System.out.println("\nPrinting the value which is maintained as tree");
		
		p.forEach((x)->System.out.println(x));
		
		System.out.println(p.peek());//gives top most value, which is smallest one
		
		p.poll();
		p.poll();
		
		System.out.println("\nPrinting the value after deletion of top 2 values");
		
		p.forEach((x)->System.out.println(x));
		
		
		
		
	}
}


class changePriorityType implements Comparator<Integer>
{
	public int compare(Integer o1, Integer o2)//this is overriding method of Comparator interface
	{
		if(o1<o2)
		{
			return 1;
		}
		if(o1>o2)
		{
			return -1;
		}
		return 0;
		
	}
}

class usingPriorityQueueWithHighestValueAsTop
//usually smallest value has highest priority but we changed the mechanism to highest value top priority by using 
//Comparator interface and overriding its method "compare"
{
	public void method()
	{
        PriorityQueue<Integer> p = new PriorityQueue<>(new changePriorityType());//we have to pass the class here to
        //change the mechanism
		
		p.add(30);
		p.add(40);
		p.add(20);
		p.add(10);
		p.add(5);
		p.add(3);
		
        System.out.println("\nPrinting the value by the changing the mechanism to highest value top priority");
		
		p.forEach((x)->System.out.println(x));
		
		System.out.println(p.peek());//gives top most value, which is smallest one
		
		p.poll();
		p.poll();
		
		System.out.println("\nPrinting the value after deletion of top 2 values");
		
		p.forEach((x)->System.out.println(x));
		
	}
}


public class priorityQueue {
	public static void main(String[] args)
	{
		usingPriorityQueue u = new usingPriorityQueue();
		u.method();
		
		usingPriorityQueueWithHighestValueAsTop hv = new usingPriorityQueueWithHighestValueAsTop();
		hv.method();
		
		
		
	}

}
