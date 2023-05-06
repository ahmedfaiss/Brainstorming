package Swing;
import javax.swing.*;
import java.awt.*;//Because FlowLayout is implemented from awt
import java.awt.event.*;//ActionListener is implmented from this


class myFrame1 extends JFrame implements ActionListener
{
	JTextField t;
	JButton b;
	JLabel l;
	int count=0;
	
	myFrame1()
	{
		super("JButton");
		
		setLayout(new FlowLayout());
		
		l = new JLabel("COUNTER"+ count);
		b = new JButton("Click");
		
		add(l);
		add(b);
		
		getRootPane().setDefaultButton(b);
		b.addActionListener(this);
		//b.setIcon(new ImageIcon("C:/Users/Ahmed Faisal/Downloads/Button1.JPG"));//Sets the image to button
		
		l.setToolTipText("Counter");
		
				
	}
	
	public void actionPerformed(ActionEvent e)
	{
		count++;
		l.setText(""+ count);//If you write like this, then when you click Counter text will go, only the number will remain
	}

}

public class jlabelAndJButton {
	public static void main(String[] args)
	{
		myFrame1 f = new myFrame1();
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Closes the application after clicking the close button, if you dont you this then
		//frame will close but application wont close
		
		
	}

}
