package Swing;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class myFrame10 extends JFrame implements ActionListener, ListSelectionListener, ChangeListener
{
	JComboBox jcb;
	JList jl;
	JSpinner js1, js2;
	JTextField jtf;
	
	myFrame10()
	{
		super("JSpinner");
		
		String countries[] = {"India", "USA", "England", "Turkey", "Saudi"};
		String months[] = {"January", "Febraury", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		jcb = new JComboBox(countries);
		jl = new JList(months);
		jl.setVisibleRowCount(5);
		jtf = new JTextField(10);
		
		js1 = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
		js2 = new JSpinner(new SpinnerListModel(days));
		
		setLayout(new FlowLayout());
		add(jcb);
		add(js1);
		add(js2);
		add(jl);
		add(new JScrollPane(jl));
		add(jtf);
		
		jcb.addActionListener(this);
		jl.addListSelectionListener(this);
		js1.addChangeListener(this);
		js2.addChangeListener(this);
		
		}
	public void actionPerformed(ActionEvent e)
	{
		jtf.setText((String)jcb.getSelectedItem());
	}
	
	public void valueChanged(ListSelectionEvent e) {
		
		jtf.setText((String) jl.getSelectedValue()); 
		
		
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		if(e.getSource()==js1)
		{
			jtf.setText(js1.getValue()+"");
		}
		else
		{
			jtf.setText((String)js2.getValue());
		}
		
	}
}

public class jspinnerAndJListAndJComboBox {
	public static void main(String[] args)
	{
		myFrame10 f = new myFrame10();
		f.setSize(700, 700);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}

}
