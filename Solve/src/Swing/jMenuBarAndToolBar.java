package Swing;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

import AWT.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.awt.event.ActionEvent;
import java.awt.Color;

class myFrame11 extends JFrame implements ActionListener
{
	JToolBar jtb;
	JButton b1, b2, b3, b4, b5, b6, b7;
	JMenuBar jmb;
	JMenu jm;
	JMenuItem jmi1, jmi2;
	JTextArea jta;
	
	myFrame11()
	{
		super("ToolBar Demo");
		
		jtb = new JToolBar();
		
		b1 = new JButton("Save");
		b2 = new JButton("Open");
		b3 = new JButton("Copy");
		b4 = new JButton("Paste");
		b5 = new JButton("Split");
		b6 = new JButton("Delete");
		b7 = new JButton("DeleteAll");
		
		jtb.add(b1);
		jtb.add(b2);
		jtb.add(b3);
		jtb.add(new JToolBar.Separator());
		jtb.add(b4);
		jtb.add(b5);
		jtb.add(b6);
		jtb.add(b7);
		
		jtb.setBounds(50, 10, 350, 30);
		
		jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		
		jmb = new JMenuBar();
		jm = new JMenu("File");
		jmi1 = new JMenuItem("Save");
		jmi2 = new JMenuItem("Open");
		
		jm.add(jmi1);
		jm.addSeparator();
		jm.add(jmi2);
		jmb.add(jm);
		setJMenuBar(jmb);
	
		
		add(jtb, BorderLayout.NORTH);
		add(jta, BorderLayout.CENTER);
		
		b2.setActionCommand("Open");
		b2.addActionListener(this);
		jmi2.addActionListener(this);
		b1.addActionListener(this);
		jmi1.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Open"))
		{
			JFileChooser jfc = new JFileChooser();
			jfc.showOpenDialog(this);
			File f = jfc.getSelectedFile();
			
			try
			{
				FileInputStream fis = new FileInputStream(f);
				byte b[] = new byte[fis.available()];
				fis.read(b);
				String str = new String(b);
				
				jta.setText(str);
				fis.close();
				
			}
			catch(Exception ec)
			{
				
			}
		}
		else
		{
			Color col = JColorChooser.showDialog(this, "Font Color", Color.RED);
			jta.setForeground(col);
		}
	}
}

public class jMenuBarAndToolBar {
	public static void main(String[] args)
	{
		myFrame11 f = new myFrame11();
		f.setSize(700,700);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}

}
