/*
 *  Method body can be written inside interface by making method as default as u 
 * can see below here
 * This is becuz after some time if you want to add some methods in interface
 * then you will have to write all the defined method in the interface in the
 * implemented classes, So you can't change every class for this reason this action
 * item is created
 * If you override the method inside the class then the method inside the class will 
 * be called
 * java wont support multiple inheritance but it allows multiple interfaces
 * becuz -> if you think like java for Ex: suzuki is a car and it also has
 * music player system in it  but we dont say suzuki is a car and also music player
 * but we can say suzuki is a car but it has a interface of music player
 * # C++ thinks like suzuki is a car and also a music system
 * 
 */

package Interface;

interface one
{
	void hello1();
	private void hello1by2()
	{
		System.out.println("this is private");
	}
	default void hello2()
	{
		hello1by2();
		System.out.println("this is also possible");
	}

	
}

interface two extends one
{
	void hello3();
}

class three implements two, one
{
	public void hello1() {
		System.out.println("this is the body of interface1");
	}
	public void hello3()
	{
		System.out.println("This is the body of interface2");
	}
}

public class InterfaceExample2 {
	public static void main(String []args)
	{
	three t = new three();
	t.hello2();

}
}
