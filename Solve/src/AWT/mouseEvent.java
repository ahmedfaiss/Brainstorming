package AWT;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class myFrame10 extends Frame implements MouseListener, MouseMotionListener
{
	Label l1, l2;
	
	myFrame10()
	{
		super("MouseEvent");
		
		l1 = new Label("");
		l2 = new Label("");
		
		setLayout(null);
		
		l1.setBounds(10, 40, 100, 100);
		l2.setBounds(10, 150, 100, 100);
		
		add(l1);
		add(l2);
		
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		l1.setText("MouseDragged");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		l1.setText("MouseMoved");
		l2.setText("("+e.getX()+", "+e.getY()+")");//you will get the co-ordinates
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		l1.setText("MouseClicked");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	    l1.setText("MousePressed");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		l1.setText("MouseReleased");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		l1.setText("MouseEntered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		l1.setText("MouseExited");
		
	}
}

public class mouseEvent {
	public static void main(String[] args)
	{
		myFrame10 f = new myFrame10();
		f.setSize(300,300);
		f.setVisible(true);
	}

}
