package AWT;

import java.awt.*;
import java.awt.event.*;

class myFrame4 extends Frame implements ActionListener
{
	Label l;
	TextField tf;
	TextArea ta;
	Button b;
	
	myFrame4()
	{
		super("TextArea ");
		
		l = new Label("This field is empty");
		tf = new TextField(20);
		ta = new TextArea(10,10);
		b = new Button("Click");
		
		
		setLayout(new FlowLayout());
		
		add(l);
		add(ta);
		add(tf);
		add(b);
		
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		//l.setText(ta.getSelectedText());   //This Prints the words selected for the text are to the label
		//ta.append(tf.getText());   //Test Area will be concatenated with the word that we type in the text Field, and this is update when we 
		//click on the button
		
		ta.insert(tf.getText(), ta.getCaretPosition());  //Updates the words entered in the textfield to the text area where cursor is pointed
		
		
	}
}

public class textArea {
	public static void main(String[] args)
	{
		myFrame4 f = new myFrame4();
		f.setSize(300,300);
		f.setVisible(true);
	}

}
