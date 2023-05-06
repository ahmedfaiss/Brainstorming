package AWT;
import java.awt.*;
import java.awt.event.*;

class myFrame14 extends Frame
{
	TextField t;
	Button b;
	int count=0;
	
	myFrame14()
	{
		super("HandlingEvents");
		
		b = new Button("Click");
		t = new TextField("0",20);
		
		setLayout(new FlowLayout());
		
		add(b);
		add(t);
		//b.addActionListener(new myActionEvent()); -> this is the one method of handling event by using inner class, just defining the object
		
		
		
		//The second method is by anonymous class as shown below
		
		/* 
		 
		 * //This is an interface, it must be confusing how object of an interface is created, but its not the case here because it is 
		 * implementing interface to define anonymous class, this is allowed, actually this is an anonymous class
		
					b.addActionListener(new ActionListener()   
				{
					public void actionPerformed(ActionEvent e)
					{
						count++;
						t.setText(String.valueOf(count));
					}
				});
				
		*/
		
		//The Third method is by using lambda Expression as ActionEvent has only one method inside the interface, so we can implement lambda
		
		b.addActionListener((ActionEvent e) -> //Java knows which method to call as there is only one method
		{
			count++;
			t.setText(String.valueOf(count));
		});
		
	}
	
	
	
	//this is the first methods inner class
	class myActionEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			count++;
			t.setText(String.valueOf(count));
		}
	}
	
	
}

public class waysOfHandlingEvents {
	public static void main(String [] args)
	{
		myFrame14 f = new myFrame14();
		f.setSize(300,300);
		f.setVisible(true);
	}

}
