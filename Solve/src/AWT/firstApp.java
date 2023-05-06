package AWT;

import java.awt.*;

public class firstApp {
	public static void main(String[] args)
	{
		Frame f = new Frame("My First App");//for creating frame
		//here HasA relationship because frame is containing in the class, HasA is Containment
		f.setLayout(new FlowLayout());//If you dont set this then everything you create will occupy whole screen, So to take their natural size
		//we have to use this
		
		Button b = new Button("OK");
		Label l = new Label("Name ");
		TextField t = new TextField(20);
		
		f.add(l);
		f.add(t);
		f.add(b);
		
		f.setSize(300,300);//setting the size of the frame
		f.setVisible(true);//This is to make the screen visible or else it wont be visible to look and feel
		
	}

}
