package AWT;

import java.awt.*;
import java.awt.event.*;

class myFrame5 extends Frame implements ItemListener, ActionListener
{
	List l;
	Choice c;
	TextArea ta;
	
	myFrame5()
	{
		super("ListBox and choice");
		
		l = new List(4,true);
		c = new Choice();
		ta = new TextArea(10,30);
		
		l.addItemListener(this);
		c.addItemListener(this);
		l.addActionListener(this);
		
		l.add("Monday");//adding all these to the listbox
		l.add("Tuesday");
		l.add("wednesday");
		l.add("Thurday");
		l.add("Friday");
		l.add("Saturday");
		l.add("Sunday");
		
		
		c.add("January");//adding all these to the choice box
		c.add("February");
		c.add("March");
		c.add("April");
		c.add("May");
		
		setLayout(new FlowLayout());
		
		add(l);
		add(c);
		add(ta);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
        String list[]  = l.getSelectedItems();//getting the selected items
		
		String str="";
		
		for(String x:list)
		{
			str+= x+"\n";//concatinating the items
			ta.setText(str);
		}
		
	}
	
	
	public void itemStateChanged(ItemEvent e)
	{
		String str="";
		
		if(e.getSource()==l)
		{
			ta.setText(l.getSelectedItem());
			
		}
		if(e.getSource()==c)
		{
			ta.setText(c.getSelectedItem());
		}
		
	}
}

public class listBoxAndChoice {
	public static void main(String[] args)
	{
		myFrame5 f = new myFrame5();
		f.setSize(300,300);
		f.setVisible(true);
	}

}
