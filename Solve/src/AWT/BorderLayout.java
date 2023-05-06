package AWT;
import java.awt.*;
import java.awt.event.*;

class myFrame8 extends Frame
{
	Button b1, b2, b3, b4, b5;
	
	myFrame8()
	{
		super("BorderLayout");
		
		b1 = new Button("one");
		b2 = new Button("two");
		b3 = new Button("Three");
		b4 = new Button("Four");
		b5 = new Button("Five");
		
		add(b1, BorderLayout.NORTH);//These constants are deprecated so the application is not working as expected
		add(b2, BorderLayout.SOUTH);
		//add(b3, BorderLayout.EAST);
		add(b4, BorderLayout.WEST);
		add(b5, BorderLayout.CENTER);
		
		Panel p = new Panel();
		
		p.setLayout(new GridLayout(3,1));
		
		p.add(new Button("Mon"));
		p.add(new Button("Tue"));
		p.add(new Button("Wed"));
		
		add(p, BorderLayout.EAST);
		
	}
	
}

public class BorderLayout {

	public static final Object CENTER = null;
	public static final Object WEST = null;
	public static final Object EAST = null;
	public static final Object NORTH = null;
	public static final Object SOUTH = null;
	
	public static void main(String[] args)
	{
		myFrame8 f = new myFrame8();
		f.setSize(300,300);
		f.setVisible(true);
	}

}
