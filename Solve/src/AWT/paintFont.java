package AWT;
import java.awt.*;
import java.awt.event.*;

//Frame is an container, So in java all the containers will have paint method

class myFrame16 extends Frame
{
	int x = 0, y = 0;
	myFrame16()
	{
		super("Paint");
		
		setLayout(new FlowLayout());
		
		addMouseListener(new MouseAdapter()
				{
					public void mouseClicked(MouseEvent e)
					{
						x = e.getX();
						y = e.getY();
						repaint();
					}
				});
		
		addMouseMotionListener(new MouseAdapter() 
		{
			public void mouseMoved(MouseEvent e)
			{
				
			}
		});
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		//g.drawOval(x, y, 50,  50); -> also you can have oval with color filled with it
		g.fillOval(x, y, 50, 50);
	}
}


class myFrame17 extends Frame
{
	int x = 0, y = 0;
	myFrame17()
	{
		super("Paint1");
		
		setLayout(new FlowLayout());
				
		addMouseMotionListener(new MouseAdapter() 
		{
			public void mouseMoved(MouseEvent e)
			{
				x = e.getX();
				y = e.getY();
				repaint();
			}
		});
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
		g.drawString("LULU", x, y);
	}
}




public class paintFont {
	public static void main(String[] args)
	{
		myFrame16 f = new myFrame16();
		f.setSize(400,400);
		f.setVisible(true);
		
		myFrame17 f1 = new myFrame17();//This class is also same but with different type of methods
		f1.setSize(300,300);
		f1.setVisible(true);
	}

}
