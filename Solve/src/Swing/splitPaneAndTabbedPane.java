package Swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import AWT.BorderLayout;

import java.awt.Color;



class myFrame8 extends JFrame implements ListSelectionListener
{
	JSplitPane sp;
	JList list;
	JLabel jl;
	
	myFrame8()
	{
		super("Split Demo");
		
		String colors[] = {"Red","Green","Blue","Black","Yellow"};
		
		list = new JList(colors);
		list.setSelectedIndex(0);
		list.addListSelectionListener(this);
		JScrollPane jsp = new JScrollPane(list);
		
		jl = new JLabel(" ");
		jl.setOpaque(true);
		jl.setBackground(Color.RED);
		JScrollPane jsp1 = new JScrollPane(jl);
		
		//This is for SpliPane
		//sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jsp, jsp1);
		//sp.setDividerLocation(200);
		
		//For TabbedPane
		JTabbedPane tp = new JTabbedPane();
		tp.addTab("Colors", jsp);
		tp.addTab("Tabs", jsp1);
		
		add(tp);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		String str = (String) list.getSelectedValue();
		
		switch(str)
		{
			case "Red"   : jl.setBackground(Color.RED);
			               break;
			case "Green" : jl.setBackground(Color.GREEN);
	        			   break;
			case "Blue"  : jl.setBackground(Color.BLUE);
	        			   break;
			case "Black" : jl.setBackground(Color.BLACK);
	        			   break;
			case "Yellow": jl.setBackground(Color.YELLOW);
						   break;
		}
		
	}
}

public class splitPaneAndTabbedPane {
	public static void main(String[] args)
	{
		myFrame8 f = new myFrame8();
		f.setSize(800,800);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}

}
