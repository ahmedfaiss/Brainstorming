package Introduction;

public class firstProgram 
{
	public static void main(String[] args)
	{
		byte a = 9, b = 12, c;
		
		int d =10;
		float e = 10.1f;
		char f = 'd';
		
		c = (byte)(a<<4);//will have 9 on the left hand side
		c = (byte)(c|b);// will have 12 on the left hand side, now we have both 9 and 12 on the variable c
		
		//to get the value we have to do the below step
		
		System.out.println((c&0b11110000)>>4);//we will get the value 9, only if we shift right ride or else the value will be different
		System.out.println((c&0b00001111));
		
		a = (byte)(a^b);
		b = (byte)(a^b);
		a = (byte)(a^b);//this will swap the value between a and b
		
		System.out.println("a : "+a+" "+"b : "+b);
		
		System.out.printf("Hello %d %f %c \n", d, e, f);
		System.out.printf("Hello %2$d %1$f %3$c \n", e, d, f);//we can give a place name and give in same format, that is we can change the format also
		System.out.printf("%06.2f",e);//Takes 6 digit places and fills 0 in the blank spaces and takes only2 spaces after decimal
	}
}

//windening means -> storing small size value in higher size value is called as upcasting
//narrowing means -> storing higher size value in lowersize value is called as downcasting
