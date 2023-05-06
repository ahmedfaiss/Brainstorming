package AWT;
import java.awt.*;
import java.awt.event.*;

class myFrame6 extends Frame implements AdjustmentListener
{
	Scrollbar red, green, blue;
	TextField tf;
	
	myFrame6()
	{
		super("Scrollbar");
		
		red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255 );
		green  = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
		blue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255 );
		
		tf = new TextField(20);
		
		red.addAdjustmentListener(this);
		green.addAdjustmentListener(this);
		blue.addAdjustmentListener(this);
		
		tf.setBounds(50, 50, 300, 50);//Origin from the left side, origin from the top, width, height
		red.setBounds(50, 120, 300, 50);
		green.setBounds(50, 190, 300, 50);
		blue.setBounds(50, 260, 300, 50);
		
		//origin from the top should be more than (origin from the top+height) or else the the coming fields will collide
		
		setLayout(null);
		
		add(tf);
		add(red);
		add(green);
		add(blue);
		
		
	}

	
	public void adjustmentValueChanged(AdjustmentEvent e) 
	{
	
		tf.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
	}
}

public class scrollBarColors {
	public static void main(String [] args)
	{
		myFrame6 f = new myFrame6();
		f.setSize(500,500);
		f.setVisible(true);
	}

}
