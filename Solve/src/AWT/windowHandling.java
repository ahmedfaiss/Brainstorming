package AWT;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class myFrame11 extends Frame implements WindowListener//There are 7 abstract method that you have to implement to make class concrete
{
	Label l;
	myFrame11()
	{
		super("WindowEvent");
		
		l = new Label("");
		
		setLayout(null);
		
		l.setBounds(20, 40, 100, 100);
		
		add(l);
		
		addWindowListener(this);
	}
	
	public void windowOpened(WindowEvent e)
	{
		l.setText("Window Opened");
	}
	public void windowClosing(WindowEvent e)
	{
		l.setText("Window Closing");
		System.exit(0);
	}
	public void windowClosed(WindowEvent e)
	{
		l.setText("Window Closed");
	}
	public void windowIconified(WindowEvent e)
	{
		l.setText("Window Iconified");
		
	}
	public void windowDeiconified(WindowEvent e)
	{
		l.setText("Window DeIconified");
	}
	public void windowActivated(WindowEvent e)
	{
		l.setText("Window Activated");
	}
	public void windowDeactivated(WindowEvent e)
	{
		l.setText("Window DeActivated");
	}
}
public class windowHandling {
	public static void main(String[] args)
	{
		myFrame11 f = new myFrame11();
		f.setSize(300,300);
		f.setVisible(true);
	}

}
