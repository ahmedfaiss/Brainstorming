package Swing;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class myFrame5 extends JFrame implements TreeSelectionListener
{
	JLabel l;
	JTree t;
	myFrame5()
	{
		super("JTREE");
		
		DefaultMutableTreeNode dm = new DefaultMutableTreeNode("C:\\Program Files (x86)");//Makes the files inside the directory as Tree
		
		File f = new File("C:\\Program Files (x86)");
		
		for(File x:f.listFiles())
		{
			if(x.isDirectory())
			{
				DefaultMutableTreeNode temp = new DefaultMutableTreeNode(x.getName());
				for(File y:x.listFiles())
				{
					temp.add(new DefaultMutableTreeNode(x.getName()));
				}
				dm.add(temp);
			}
			else
			{
				dm.add(new DefaultMutableTreeNode(x.getName()));
			}
		}
		
		l = new JLabel("No Files Selected");
		t = new JTree(dm);
		
		JScrollPane sp = new JScrollPane(t);
		
		add(sp, BorderLayout.CENTER);
		add(l,  BorderLayout.SOUTH);
	}
	
	public void valueChanged(TreeSelectionEvent e)
	{
		l.setText(e.getPath().toString());
	}
}

public class jTree {
	public static void main(String[] args)
	{
		myFrame5 f = new myFrame5();
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
