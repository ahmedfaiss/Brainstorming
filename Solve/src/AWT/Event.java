package AWT;


//* A Component has -> 1. Properties(i,e Data variables), methods(i,e behavior), Event(i,e when you click in ok button it should do something,
//   clicking button is event
//* when a component is called it creates an even(i,e a class) but there should be an listener to perform the callback or action for the event
//* So this listener can be called as receiver or handler -> and this is defined by the user.
//*  for component and event there is an inbuilt class but for handling has to be done by you

import java.awt.*;
import java.awt.event.*;

class myFrame1 extends Frame implements ActionListener//ActionListener is a interface class so the methods has to be implemented in this class
{

	int count=0;
	Label l;
	Button b;
	
	public myFrame1()
	{
		super("Counter App");
		
		l = new Label("   "+count);
		b = new Button("Click");
		b.addActionListener(this);//This is saying that this class object itself the listener
		
		setLayout(new FlowLayout());
		add(l);
		add(b);
				
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {//this is method is to show what has to happen when the event is occur
		// TODO Auto-generated method stub
		
		count++;//This action has to be performed when button is clicked
		l.setText("   "+count);	//show the updated counter in the label
		
	}
}


public class Event {
	public static void main(String[] args)
	{
		myFrame1 f = new myFrame1();
		
		f.setSize(300,300);
		f.setVisible(true);
	}

}
