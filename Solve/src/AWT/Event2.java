package AWT;
import java.awt.*;
import java.awt.event.*;


class myFrame3 extends Frame
{
	Label l1, l2;
	TextField t;
	
	public myFrame3()
	{
		super("TextField");
		
		l1 = new Label("");
		l2 = new Label("This will change after pressing enter");
		t = new TextField(20);
		
		Handler h =  new Handler();
		
		t.addTextListener(h);
		t.addActionListener(h);
		
		setLayout(new FlowLayout());
		
		add(l1);
		add(t);
		add(l2);
	}
	
	class Handler implements TextListener, ActionListener
	{
		
		@Override
		public void textValueChanged(TextEvent e)
		{
			l1.setText(t.getText());
			
		}

		@Override
		public void actionPerformed(ActionEvent e)
		{
			l2.setText(t.getText());
			
		}
		
	}
}

public class Event2 {
	public static void main(String[] args)
	{
		myFrame3 f = new myFrame3();
		f.setSize(300,300);
		f.setVisible(true);
	}

}
