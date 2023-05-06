package AWT;

//Adapter class is a concrete class, because if you want to inherit just windowClosing method, then if you implement windowListener then you
//have to inherit all the 7 methods present inside the interface that's why java created the class called as WindowAdapter where you can use
//methods without restrictions, you don't have to implement all 7 methods for using just 1 method

//If you are implementing the interface then all the methods have to inherited.
import java.awt.*;
import java.awt.event.*;

class myFrame13 extends Frame //you can write like this, that is by writing inner class
{
	myFrame13()
	{
		super("Apater Class");
		//addWindowListener(new myWindowAdapter()); -> this is one method, that is by using inner class
		
		
		//addWindowListener(new myWindowAdapter1());  -> this is the second method, that is by using outer class
		
		addWindowListener(new WindowAdapter() { // this is the third method of using window adapter, that is by using anonymous class
			public void windowClosing(WindowEvent e)//This is like writing the class all of sudden using anonymous class, here you can see
			//adapter class is written and its one of the method
			{
				System.exit(0);
			}
		});
		
	}
	
	class myWindowAdapter extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}
}

class myWindowAdapter1 extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}

public class adapterClasses {
	public static void main(String[] args)
	{
		myFrame13 f = new myFrame13();
		f.setSize(300,300);
		f.setVisible(true);
	}

}
