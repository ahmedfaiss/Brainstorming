package AWT;
import java.awt.*;
import java.awt.event.*;

class myFrame12 extends Frame implements ItemListener
{
	Button b1, b2, b3;
	TextField t1, t2, t3;
	
	Panel p1, p2, cp, mainp;
	
	Checkbox c1, c2;
	CheckboxGroup cbg;
	
	CardLayout cl;
	
	myFrame12()
	{
		super("CardLayout");
		
		cbg = new CheckboxGroup();
		c1 = new Checkbox("One", true, cbg);//making the  check box 
		c2 = new Checkbox("Two", false, cbg);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		
		cp = new Panel();
		cp.add(c1);
		cp.add(c2);
		
		
		b1 = new Button("one");
		b2 = new Button("Two");
		b3 = new Button("Three");		
				
		p1 = new Panel();
		p1.add(b1);//adding all three buttons inside a panel, like a box
		p1.add(b2);
		p1.add(b3);
		
		
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		
		p2 = new Panel();
		p2.add(t1);// adding the text boxes to the panel
		p2.add(t2);
		p2.add(t3);
		
		mainp = new Panel();
		cl = new CardLayout();
		mainp.setLayout(cl);//setting the layout as CardLayout
		
		mainp.add("one", p1);//adding the the panels p1, p2 to the CardLayout
		mainp.add("two",  p2);
		
		add(cp, BorderLayout.NORTH);
		add(mainp, BorderLayout.CENTER);
		
		
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		if(c1.getState())
		{
			cl.first(mainp);
		}
		else
		{
			cl.last(mainp);
		}
	}
}

public class cardLayout {
	public static void main(String[] args)
	{
		myFrame12 f = new myFrame12();
		f.setSize(300,300);
		f.setVisible(true);
	}

}
