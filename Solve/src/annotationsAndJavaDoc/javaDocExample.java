/**
 * @author Ahmed Faisal

 * @version 2.0
 * @since 2022
 */

package annotationsAndJavaDoc;

/**
 * 
 * @author Ahmed Faisal
 * 
 * class for reading book
 *
 */

class Book
{
	/**
	 * {@value} 10 is a static value
	 */
	public static int s = 10;
	
	/**
	 * Non-Parameterized constructor
	 * 
	 */
	
	public Book()
	{
		System.out.println("Constructor");
	}
	/**
	 * Parameterized Constructor
	 * @param a is a book price
	 */
	public Book(int a)
	{
		System.out.println("Parametrized Connstructor");
	}
	
	/**
	 * Name of a Book
	 */
	
	public void Name()
	{
		System.out.println("Book Name");
	}
	
	/**
	 * Price of a Book
	 * @return price
	 */
	
	public int Price()
	{
		return s;
	}
	
	/**
	 * Description of a Book
	 * @return Descriptions of Book
	 */
	
	public String Description()
	{
		return "Example Book";
	}
}

/**
 * This is a main class
 * @author Ahmed Faisal
 *
 */
public class javaDocExample {
	/**
	 * static main Block
	 * @param args takes inputs
	 */
	public static void main(String[] args)
	{
		
	}

}
