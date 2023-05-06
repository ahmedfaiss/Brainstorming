package collectionFramework;
import java.util.*;

//Collection is nothing but arranging the data in the data memory, that data will be used by java program
//Java provides different type of collections that is suitable depending upon the requirements or depending upon the
//operation that you are performing

interface one
{
	public void display();
}

class methodsInArrayList
{
	public void method()
	{
		
		
		ArrayList<Integer> al = new ArrayList<>(20);//20 is size, even though if you dont mention it, it is ok
		al.add(20);
		al.add(30);
		al.add(0, 40);//adds at index 0 and moves 20 and 30 to index 1 and 2
		
		ArrayList<Integer> al1 = new ArrayList<>(List.of(50,60,70));//you can also add elements to arrayList like this
		
		al.addAll(al1);//adds all the elements from al1
		al.addAll(1,al1);
		
		System.out.println(al.contains(50));//checking whether 50 is present or not returns boolean
		
		System.out.println(al.get(5));//gives value at index 5
		
		/*
		 * one o = ()-> {System.out.println(al);};
		   o.display();//displaying using lambda expression
		
		*/
		
		System.out.println(al.indexOf(70));
		System.out.println(al.lastIndexOf(70));
		
		System.out.println(al.set(3, 100));//changes the value at index 3 to 100
		
		System.out.println(al);
		
		//Printing the elements
		
		System.out.println("\n Printing using for loop\n");
		
		for(int i=0; i<al.size() ; i++)
		{
			System.out.print(al.get(i)+"  ");//you can't use al[i], because it is not an array, you have to use get method
		}
		System.out.println("\n Printing using for each loop\n");
		
		//also you can use for each loop
		
		
		
		for(Integer x:al)//instead of Integer you can use "var" also
		{
			System.out.print(x+"  ");
		}
		System.out.println();
		
		
		
	}
}

class displayUsingIterator//allows only one direction movement
//Iterator is used as reference as you can see below, and it goes on moving forward
{
	public void method()
	{
		ArrayList<Integer> al = new ArrayList<>();//here i didn't define the size of arraylist
		al.add(20);
		al.add(30);
		al.add(0, 40);
		
		System.out.println("\nPrinting using while loop using iterator\n");
		
		Iterator<Integer> it = al.iterator();//here you can see left side Iterator I is capital and right side it is small
		//letter
		
		
		while(it.hasNext())//hasNext confirms whether there is a current element in the arrayList, only if true then it 
		//will enter the loop
		{
			System.out.println(it.next());//next()  prints the current element
		}
		
		//you can also use for loop for printing using iterator
		System.out.println("\nPrinting using for loop using iterator\n");
		for(Iterator<Integer> it1 = al.iterator(); it1.hasNext();)//in for loop initializing and condition is used but
			//updation is not used
		{
			System.out.println(it1.next());
		}
	}
}

class displayUsingLambda
{
	public void method()
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(30);
		al.add(0, 40);
		
		System.out.println("\n Printing using lambdaExpression\n");
		
		al.forEach((x)->{System.out.println(x);});//using lambda expression
		
		System.out.println("\n Printing using lambdaExpression using Scope reesolution\n");
		
		al.forEach(System.out::println);//for each method goes with each element and using println expression to display it
	}
}

class displayUsingListIterator//It allows bidirectional movement
{
	public void method()
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(30);
		al.add(0, 40);
		
		ListIterator<Integer> lt = al.listIterator();
		
		System.out.println("\n Printing using ListIterator\n");
		
		while(lt.hasNext())
		{
			System.out.println(lt.nextIndex());
			System.out.println(lt.next());
			
		}
		
	}
}

public class studentChallenge1 {
	public static void main(String[] args)
	{
		methodsInArrayList m = new methodsInArrayList();
		m.method();
		
		displayUsingIterator d = new displayUsingIterator();
		d.method();
		
		displayUsingListIterator l = new displayUsingListIterator();
		l.method();
		
		displayUsingLambda le = new displayUsingLambda();
		le.method();
		
		///////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("\n printing using for each loop and lambda expression by calling static method\n");
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(30);
		al.add(0, 40);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(80);
		
		al.forEach((n)->show(n));//for each loop will scan all the elements and passes n as arguments, there is already
		//method so no need to write println method, you can just call the method
		
	}
	
	static void show(int n)
	{
		if(n>60)
		{
			System.out.println(n);
		}
	}

}
