package Interface;

/* # Interface is also used to achieve polymorphism but instead of using
 * extend, we r using implements, extend is only for class
 * # we don't have to put as abstract in every method, we just have to indicate 
 * as interface in beginning of the interface -> for Ex -> interface test{} ->
 * every method of a interface is a abstract without definition
 * # Everything under interface is abstract
 * # same as abstract we can have reference but not object
 * #methods inside interface are by default public and abstract
 */
class A
{}

class Phone
{
	void call()
	{
		System.out.println("callling");
	}
	void Sms()
	{
		System.out.println("Messaging");
	}
}

interface camera
{
    void click();
	void record();
}

interface musicplayer
{
	void play();
	void stop();
}

class smartPhone extends Phone implements camera,musicplayer
{
	public void click()
	{
		System.out.println("Clicking");
	}
	public void record()
	{
		System.out.println("recording");
	}
	public void play()
	{
		System.out.println("Playing");
	}
	public void stop()
	{
		System.out.println("Stopping");
	}
}

public class interfaceDef {
	public static void main(String [] args)
	{
	smartPhone sm = new smartPhone();
	sm.click();
	}

}
