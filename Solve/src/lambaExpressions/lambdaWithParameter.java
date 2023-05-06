package lambaExpressions;

interface lambda
{
	public int add(int a, int b);
}

public class lambdaWithParameter {
	public static void main(String[] args)
	{
		lambda l = (a,b)->{int d;d= a+b; return d;};//we don't have to write int a, int b to 
		//pass arguments, compiler automatically takes the data  types
		//if you just write a+b and dont give return also -> {a+b;};, like this
		//if you give it works because compiler automatically returns the sum
		//this is called lambda expressions, only expression is used with this
		//which I showed inside comment block, but with the above code i have
		//written it should return d, because we have used extra variable
		//you can call the method as shown below
		
		System.out.println(l.add(5, 6));//or else you can call methods as shown below
		int r = l.add(6, 7);
		System.out.println(r);
		//you can also use different data type parameters also like-> (int a, String b)
	}

}
