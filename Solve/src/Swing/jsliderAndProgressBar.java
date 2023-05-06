package Swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import AWT.BorderLayout;

import java.awt.Graphics;
import java.awt.Color;

class myFrame9 extends JFrame implements ChangeListener
{
	JSlider js;
	JProgressBar jpb;
	JPanel jp, jp1;
	int w = 50;
	
	myFrame9()
	{
		
		super("JSlider and ProgressBar");
		
		js = new JSlider(0,100, 50);
		js.setBounds(10, 10, 500, 500);
		js.setMajorTickSpacing(10);
		js.setMinorTickSpacing(1);
		js.setPaintTicks(true);
		js.setPaintLabels(true);
		
		
		jpb = new JProgressBar();
		jpb.setString("");
		jpb.setStringPainted(true);
		jpb.setIndeterminate(false);
		
		jp = new JPanel() {
			public void paintComponent(Graphics g)
			{
				g.drawOval(200, 200, w, w);
				
			}
		};
		
		
		jp1 = new JPanel();
		jp1.add(jpb);
	
		add(js, BorderLayout.NORTH);
		add(jp, BorderLayout.CENTER);
		add(jp1, BorderLayout.SOUTH);
		
		js.addChangeListener(this);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		w = js.getValue();
		jp.repaint();
		jpb.setString(w+"%");
		jpb.setStringPainted(true);
		jpb.setValue(w);
		
	}
}

public class jsliderAndProgressBar {
	public static void main(String[] args)
	{
		myFrame9 f = new myFrame9();
		f.setSize(500,1000);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}

}
