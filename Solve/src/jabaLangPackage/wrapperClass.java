package jabaLangPackage;

/*
 * # When I write int i = 10; then if I write like "i." then no methods will pop out
 * because i is just a variable, its a primitive datatypes. 
 * but java provides, In java everything should be an Object,  So that
 * we can say java is OOP language, but primitives are not an Object
 * # So java provides classes for primitives called as wrapper classes
 *  so that we can call methods when we write "i."
 *  Wrapper classes -> 1. Character, 2.Byte, 3. Short, 4.Integer, 5.Long, 6.Float
 *  7. Double, 8.Boolean, aLl these are present in java.lang paackage which is
 *  automatically imported
 *  
 *  under Object class there are 3 sub classes -> 1. Number, 2.Character, 3.Boolean
 *  and under Number there are 5 sub classes -> 1.Byte, 2.Short. 3.Integer, 4.Long
 *  5.Float, 6.Double
 */



public class wrapperClass {
	
	public static void main(String [] args)
	{
		Integer a = new Integer(10);//This is constructor, ad this is not allowed
		//So it is better to avoid using it
		
		Integer b = Integer.valueOf(10);//this  can be followed to assign values
		
		Integer c = 10;//This can also be followed
		
		Float d = Float.valueOf("123.45");//This converts string value to float and
		//assigns to d
		
		Float e = Float.valueOf(123.45f);//This directly assigns to e
		
		Double f = Double.valueOf("123.45");
		
		Character g = Character.valueOf('A');//should give value in single quotes
		//because it takes a single character
		
		//Byte h = Byte.valueOf(12); -> we cant give like this we have to first convert
		// the value to byte adn then we can assign it here or else you can use String
		
		Byte h= 12;
		
		
		Byte i = Byte.valueOf(h);//This is called as boxing or wrapping
		//Because i makes h = 12 as box and references to it
		
		Byte j = Byte.valueOf("13");//we can give directly like this using string
		//where the value of method converts it to byte
		
		Boolean k = Boolean.valueOf("true");
		
		Float l = Float.valueOf(123.45f);
		float m = l.floatValue();//it is called as Un boxing
		float n = l; //this is called as auto unboxing, the l by default calls 
		//floatvalue method and assigns to n
		
		Integer in = 10;
		
		int v = in.valueOf("11111", 2);//gives the int value of binary,here 2 is 
		//indicating the radix that it is  binary and alos you can change the 
		//radix to hexa and see the output in integer
		System.out.println(v);
		
		String st = "1234";
		
		
		Integer inte = Integer.parseInt(st);
		System.out.println(inte);
		
		
	}

}
