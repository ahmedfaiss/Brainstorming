package Swing;

import javax.swing.*;
import java.awt.event.*;

import java.awt.*;

class myFrame3 extends JFrame implements ActionListener
{
	JCheckBox c1, c2;
	JRadioButton r1, r2;
	JTextField tf;
	
	myFrame3()
	{
		super("CheckBox");
		
		setLayout(new FlowLayout());
		
		tf = new JTextField(20);
		
		c1 = new JCheckBox("BOLD");
		c1.setMnemonic(KeyEvent.VK_B);//you can set as Bold by using keyboard also, by pressing ctrl+B
		
		c2 = new JCheckBox("ITALIAN");
		c2.setMnemonic(KeyEvent.VK_I);//ctrl+I
		
		r1 = new JRadioButton("lower");
		r2 = new JRadioButton("UPPER");
		
		tf.setBounds(20,50,50, 50);
		c1.setBounds(80, 50, 10, 10);
		c2.setBounds(100,50, 10, 10);
		
		r1.setBounds(80, 70, 10, 10);
		r2.setBounds(100, 70, 10, 10); 
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		add(tf);
		add(c1);
		add(c2);
		add(r1);
		add(r2);
		
		c1.addActionListener(this);
		c2.addActionListener(this);
		r1.addActionListener(this);
		r2.addActionListener(this);
		
		r1.setActionCommand("lower");
		r2.setActionCommand("UPPER");
		
		
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		switch(e.getActionCommand())//IT gets what was the action command that is set
		{
			case "lower" : tf.setText(tf.getText().toLowerCase());
			               break;
			               
			case "UPPER" : tf.setText(tf.getText().toUpperCase());
			               break;
		}
		
		int b = 0 , i = 0;
		
		if(c1.isSelected())
		{
			b = Font.BOLD;//Property of Bold font is taken in b
		}
		if(c2.isSelected())
		{
			i = Font.ITALIC;
		}
		
		Font f = new Font("Times New Roman", b|i, 15);//Here b|i means or binary or operation, it checks whether it is selected or not,
		//if selected then it will make that font
		tf.setFont(f);
	}
	
	
	
	
}

public class jcheckboxAndJRadioButton {
	
	public static void main(String[] args)
	{
		
		myFrame3 f = new myFrame3();
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
