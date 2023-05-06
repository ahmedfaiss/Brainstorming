package Swing;


import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.MouseInputAdapter;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import java.awt.*;

import AWT.BorderLayout;

class myFrame6 extends JFrame implements ActionListener
{
	JLabel l1, l2, l3, l4;
	JRadioButton b1, b2, b3;
	JLayeredPane jlp;
	JPanel jp;
	
	
	myFrame6()
	{
		super("LayeredPane");
		
		b1 = new JRadioButton("Red");
		b2 = new JRadioButton("Green");
		b3 = new JRadioButton("Blue");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		
		
		jp = new JPanel();
		jp.add(b1);
		jp.add(b2);
		jp.add(b3);
		jp.setBounds(50, 50, 200, 50);
		
		l1 = new JLabel("");
		l1.setBackground(Color.RED);
		l1.setBounds(100, 200, 200, 200);
		l1.setOpaque(true);
		
		l2 = new JLabel("");
		l2.setBackground(Color.GREEN);
		l2.setBounds(120, 220, 200, 200);
		l2.setOpaque(true);
		
		l3 = new JLabel("");
		l3.setBackground(Color.BLUE);
		l3.setBounds(140, 240, 200, 200);
		l3.setOpaque(true);
		
		l4 = new JLabel("");
		l4.setBackground(Color.BLACK);
		l4.setBounds(100, 200, 40, 40);
		l4.setOpaque(true);
		
		
		jlp = new JLayeredPane();
		
		jlp.add(l1, new Integer(0));
		jlp.add(l2, new Integer(1));
		jlp.add(l3, new Integer(2));
		
		jlp.add(l4, new Integer(2));
		
		add(jp, BorderLayout.EAST);
		add(jlp, BorderLayout.CENTER);
		
		addMouseMotionListener(new MouseAdapter(){
			public void mouseMoved(MouseEvent e)
			{
				l4.setLocation(e.getX(), e.getY());
			}
		});
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(b1.isSelected())
		{
			jlp.setLayer(l4, 1);
		}
		if(b2.isSelected())
		{
			jlp.setLayer(l4, 2);
		}
		if(b3.isSelected())
		{
			jlp.setLayer(l4, 3);
		}
	}
	
	
}

public class layeredPane {
	public static void main(String[] args)
	{
		myFrame6 f = new myFrame6();
		f.setSize(700,700);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}

}
