package AWT;
import java.awt.*;

class myFrame extends Frame
{
	Label l;
	Button b;
	TextField t;
	
	public myFrame()
	{
		super("First App");
		
		setLayout(new FlowLayout());
		
		l = new Label("Name");
		t = new TextField(20);
		b = new Button("Ok");
		
		add(l);
		add(t);
		add(b);
		
	}
}

public class firstAppOtherWay {
	public static void main(String[] args)
	{
		myFrame f = new myFrame();
		
		f.setSize(300,300);
		f.setVisible(true);
	}

}
