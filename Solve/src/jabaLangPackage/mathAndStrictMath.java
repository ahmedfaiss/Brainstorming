package jabaLangPackage;

public class mathAndStrictMath {
	public static void main(String[] args)
	{
		System.out.println("Random " + Math.random());//Prints random value from
		//0 to 1, if you want more than 1 then multiply with integer number
		
		System.out.println(StrictMath.random());//StrictMath gives once decimal
		//point more than math
		
		System.out.println("Next number "+ Math.nextAfter(12.5, 13));//gives value
		//next to 12.5 and below 13, and if we give ll instead of 13, then
		//it gvies just below than 12.5 but not less than 11
		
		System.out.println("Exponential " +Math.exp(2));//gives expo of 2
		
		System.out.println("Positive "+Math.abs(-12.5));//Gives positive value
		
		System.out.println("CubeROOt "+Math.cbrt(27));//Gives cuberoot of a a value given
		
		System.out.println("Floor div "+Math.floorDiv(23,4));//divides the first number by second number
		//gives the output as quotient only by int, for above input it will give
		//as 5
		System.out.println("Maximum"+Math.max(13, 120));//Gives the max value 
		//between numbers
		System.out.println("power "+Math.pow(5, 2));//gives the output by 5*5
		
		System.out.println("Exact number"+ Math.multiplyExact(20, 30));//multiplies 20*30
		
	}

}
