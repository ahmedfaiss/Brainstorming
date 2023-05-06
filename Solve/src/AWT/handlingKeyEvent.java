package AWT;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class myFrame9 extends Frame implements KeyListener
{
	Label l1, l2, l3, l4;
	
	myFrame9()
	{
		super("KeyEvent");
		
		l1 = new Label("");
		l2 = new Label("");
		l3 = new Label("");
		l4 = new Label("");
		
		setLayout(null);
		
		l1.setBounds(10, 20, 200, 50);//x-axis, y-axis, Width, height
		l2.setBounds(10, 80, 200, 50);
		l3.setBounds(10, 140, 200, 50);
		l4.setBounds(10, 200, 200, 100);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		
		addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		l1.setText("KeyTyped");//key typed means holding tyhe key that is in notepad is you hold some key it will keep on printing that value, 
		//same way typed means holding the key for a long time
		l4.setText(new Date(e.getWhen())+"");//will give the time, +"" -> is added to convert long value to string
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		l2.setText("KeyPressed");//just pressing the key
		l3.setText("");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		l3.setText("KeyReleased");//releasing the key
	    l1.setText("");//this is because when you release all the other should be epmtied
		l2.setText("");
		l4.setText("");
	}
}

public class handlingKeyEvent {
	public static void main(String[] args)
	{
		myFrame9 f = new myFrame9();
		f.setSize(300,300);
		f.setVisible(true);
	}

}
