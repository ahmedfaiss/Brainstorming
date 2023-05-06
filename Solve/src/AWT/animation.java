package AWT;
import java.awt.*;
import java.awt.event.*;

class myFrame18 extends Frame implements Runnable
{
	int x, y, tx, ty;
	
	myFrame18()
	{
		super("Animation");
		
		x = 100;
		y = 100;
		tx=ty=1;
		
		
		Thread t = new Thread(this);//Thread will be running by  this class itsel, So we are assigning the object of this class to Thread
		t.start();
		
	}
	
	public void paint(Graphics g)
	{
		//g.drawOval(x, y, 50, 50); or you can fill the oval as shown below
		g.setColor(Color.RED);
		g.fillOval(x, y, 50, 50);
		
	}
	
	public void run()
	{
		while(true)
		{
			x +=tx;
			y +=ty;
			
			if(x < 0 || x > 450)//we have to give max value less than the size given, because it will go inside the layout
			{
				tx = tx*-1;
			}
			if(y < 20 || y > 350)
			{
				ty = ty*-1;
			}
			repaint();
			
			try { Thread.sleep(5);} catch(Exception e) {}
		}
	}
}

public class animation {
	public static void main(String[] args)
	{
		myFrame18 f = new myFrame18();
		f.setSize(500,400);
		f.setVisible(true);
		
	}

}
