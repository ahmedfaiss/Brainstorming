package Swing;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class myInternalFrame extends JInternalFrame
{
	static int count=0;
	JTextArea jt;
	JScrollPane sp;
	
	myInternalFrame()
	{
		super("Documenet"+(++count), true, true, true, true);//These 4 trues are expandable, scrollable
		
		jt = new JTextArea();
		sp = new JScrollPane(jt);
		add(sp);
		JMenuBar mb = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem save = new JMenuItem("Save");
		
		file.add(save);
		mb.add(file);
		setJMenuBar(mb);
		
		setSize(300,300);
		setLocation(50, 50);
		setVisible(true);
	}
	
}

class myFrame7 extends JFrame implements ActionListener
{
	JDesktopPane dp;
	
	myFrame7()
	{
		super("Internal Frame Demo");
		
		dp  = new JDesktopPane();
		setContentPane(dp);
		
		JMenuBar mb = new JMenuBar();
		JMenu Document  = new JMenu("Document");
		JMenuItem new1  = new JMenuItem("New");
		
		Document.add(new1);
		mb.add(Document);
		setJMenuBar(mb);
		
		new1.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		myInternalFrame mi = new myInternalFrame();
		dp.add(mi);
	}
}
public class internalFrame {
	public static void main(String[] args)
	{
		myFrame7 f = new myFrame7();
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}

}
