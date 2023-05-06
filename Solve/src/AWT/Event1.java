package AWT;
import java.awt.*;
import java.awt.event.*;

class myFrame2 extends Frame implements ItemListener
{
	Label l;
	Checkbox c1, c2, c3;
	
	public myFrame2()
	{
		super("CheckBox");
		
		l = new Label("Nothing Is Selected");
		c1 = new Checkbox("Java");
		c2 = new Checkbox("Python");
		c3 = new Checkbox("c++");
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
		add(l);
		add(c1);
		add(c2);
		add(c3);
		
		setLayout(new FlowLayout());
		
	}
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		String str = "";
		
		if(c1.getState())
		{
			str = str+" "+c1.getLabel();
		}
		if(c2.getState())
		{
			str = str+" "+c2.getLabel();
		}
		if(c3.getState())
		{
			str = str+" "+c3.getLabel();
		}
		
		if(str.isEmpty())
		{
			str="Nothing is Selected";
		}
		
		l.setText(str);
		
	}
	
}

class myFrame2Sub extends Frame implements ItemListener
{
	Label l;
	Checkbox c1, c2, c3;
	CheckboxGroup cbg;//set of checkboxes are kept inside a group then they become a radio button
	

	public myFrame2Sub() 
	{
		
		super("RadioButton");
		
		cbg = new CheckboxGroup();//this has to be given as the parameter to the check box, this is saying that in whcih check box group the
		//check box has to put
		
		l = new Label("Nothing is Selected");
		
		c1 = new Checkbox("Java",false,cbg);
		c2 = new Checkbox("Python",false,cbg);
		c3 = new Checkbox("C++",false,cbg);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
		
		
		add(l);
		add(c1);
		add(c2);
		add(c3);
		
		setLayout(new FlowLayout());
		
		
		
		
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		String str = "";
		
		if(c1.getState()) {
			str = str+" "+c1.getLabel();
		}
		if(c2.getState())
		{
			str = str+" "+c2.getLabel();
		}
		if(c3.getState())
		{
			str = str+" "+c3.getLabel();
		}
		
		if(str.isEmpty())
		{
			str = "Nothing is selected";
		}
		
		l.setText(str);
		
	
	}
	
}

public class Event1 {
	public static void main(String[] args)
	{
		myFrame2 f  = new myFrame2();//this is for checkbox where how much ever fields you want you can select
		f.setSize(300,300);
		f.setVisible(true);
		
		
		myFrame2Sub fs = new myFrame2Sub();
		fs.setSize(300,300);
		fs.setVisible(true);
	}

}
