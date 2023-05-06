package AWT;
import java.awt.*;
import java.awt.event.*;

class myFrame7 extends Frame
{
	Button b1, b2, b3, b4, b5;
	
	myFrame7()
	{
		super("FlowLayout");
		
		b1 = new Button("one");
		b2 = new Button("Two");
		b3 = new Button("Three");
		b4 = new Button("Four");
		b5 = new Button("Five");
		
		FlowLayout fl = new FlowLayout();
		
		fl.setAlignment(FlowLayout.LEFT);//This will make the button to form from the left
		
		fl.setHgap(50);//setting the gap between the buttons
		
		setLayout(fl);//setting the layout
		
		add(b1);//adding the buttons
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		//as you resize the the screen the buttons position will also change
		
	}
}

public class flowLayout {
	public static void main(String[] args)
	{
		myFrame7 f = new myFrame7();
		f.setSize(200,200);
		f.setVisible(true);
		
	}

}
