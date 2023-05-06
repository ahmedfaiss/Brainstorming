package AWT;
import java.awt.*;
import java.awt.event.*;

class myFrame15 extends Frame
{
	Menu file, sub;
	MenuItem open, save, close, closeall;
	CheckboxMenuItem auto;
	TextField t;
	
	myFrame15()
	{
		super("Menu");
		
		t = new TextField(20);
		
		file = new Menu("File");
		sub = new Menu("Close");
		
		open = new MenuItem("Open");
		save = new MenuItem("Save");
		close = new MenuItem("Close");
		closeall = new MenuItem("CloseAll");
		
		auto = new CheckboxMenuItem("Auto Save");
		
		sub.add(close);
		sub.add(closeall);
		
		file.add(open);
		file.add(save);
		file.add(sub);
		file.add(auto);
		
		MenuBar mb = new MenuBar();
		mb.add(file);
		setMenuBar(mb);
		
		setLayout(new FlowLayout());
		add(t);
		
		open.addActionListener((ActionEvent e) -> {t.setText("Open");});
		save.addActionListener((ActionEvent e) -> {t.setText("Save");});
		close.addActionListener((ActionEvent e) -> {t.setText("Close");});
		closeall.addActionListener((ActionEvent e) -> {t.setText("Close All");});
		
		auto.addItemListener((ItemEvent e)-> 
		{
			if(auto.getState())
			{
				t.setText("Auto Save On");
			}
			else
			{
				t.setText("Auto Save Off");
			}
		});
		
		addWindowListener(new WindowAdapter()//enabling the closing window by using adapter class and making it as anonymous class
				{
					public void windowClosing(WindowEvent e)
					{
						System.exit(0);
					}
				});
		
		
		
		
	}
}

public class menuCreation {
	public static void main(String [] args)
	{
		myFrame15 f = new myFrame15();
		f.setSize(400,400);
		f.setVisible(true);
	}

}
