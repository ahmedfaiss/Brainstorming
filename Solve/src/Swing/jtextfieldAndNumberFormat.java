package Swing;

import javax.swing.*;
import javax.swing.text.NumberFormatter;

import java.awt.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;

class myFrame2 extends JFrame
{
	JTextField tf;
	JTextArea ta;
	
	myFrame2()
	{
		super("JTextField");
		
		setLayout(new FlowLayout());
		
		tf = new JTextField(20);
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");//If you give MMMM in place of MM then this will give month name
		JFormattedTextField jf = new JFormattedTextField(df);
		
		jf.setColumns(15);
		jf.setValue(0);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormatter nfr = new NumberFormatter(nf);
		
		nfr.setAllowsInvalid(false);
		nfr.setMaximum(10000);
		
		JFormattedTextField jf1 = new JFormattedTextField(nfr);//This is to make the format you want, if you pass number format then it will
		//work as number format itsel
		jf1.setColumns(15);
		jf1.setValue(0);//sets the value as zero and takes till 10000
		
		add(tf);
		add(jf);
		add(jf1);
	}
}

public class jtextfieldAndNumberFormat {
	public static void main(String[] args)
	{
		myFrame2 f = new myFrame2();
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
