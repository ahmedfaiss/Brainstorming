package Swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

class myFrame4 extends JFrame
{
	JLabel jl;
	JTextField l;
	JButton b;
	
	myFrame4()
	{
		super("Borders");
		
		jl = new JLabel("Name");
		l = new JTextField(20);
		b = new JButton("Click");
		
		JPanel p = new JPanel();
		
		p.add(l);
		p.add(b);
		
		//Border b = BorderFactory.createLoweredBevelBorder();
		//Border b = BorderFactory.createRaisedBevelBorder();
		//Border b = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
		//Border b = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		
		//Border b = BorderFactory.createEtchedBorder();
		//Border b = BorderFactory.createLineBorder(Color.RED);
		//Border b = BorderFactory.createEtchedBorder(Color.BLACK, Color.BLUE);
		//Border b = BorderFactory.createTitledBorder("LuLu");
		
		//Border b = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.YELLOW), "Lulu");
		Border b = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Login", TitledBorder.CENTER, TitledBorder.CENTER);
		p.setBorder(b);
		
		
		setLayout(new FlowLayout());
		
		add(p);
		
		
	}
	
}

public class bordersForSwing {
	public static void main(String[] args)
	{
		myFrame4 f = new myFrame4();
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}

}
