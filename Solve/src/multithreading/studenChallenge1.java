package multithreading;

class whiteBoard
{
	int count;
	int numberOfStudents;
	String text;
	
	public void attendance()
	{
		numberOfStudents++;
	}
	
	synchronized public void write(String text)
	{
		System.out.println("teacher i writing" + text);
		while(count != 0)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		this.text = text;
		count = numberOfStudents;
		notifyAll();
	}
	
	synchronized public String read()
	{
		while(count == 0)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		String t = text;
		count--;
		if(count == 0)
		{
			notify();
		}
		return t;
	}
}

class Teacher extends Thread
{
	String text[]  = {"Hello my darling","Hello Hello my darling","HEHEHEHE","End"};
	whiteBoard wb;
	
	public Teacher(whiteBoard wb)
	{
		this.wb = wb;
	}
	
	public void run()
	{
		for(int i = 0 ; i < text.length ; i++)
		{
			wb.write(text[i]);
		}
	}
}

class Children extends Thread
{
	String name;
	whiteBoard wb;
	
	public Children(String name, whiteBoard wb)
	{
		this.name = name;
		this.wb = wb;
	}
	
	public void run()
	{
		String text;
		wb.attendance();
		do
		{
			text = wb.read();
			System.out.println(name+ " is reading" + text);
			System.out.flush();
		}
		while(text != "E");
	}
}



public class studenChallenge1 {
	public static void main(String [] args)
	{
		whiteBoard wb = new whiteBoard();
		
		Teacher t = new Teacher(wb);
		
		Children c1 = new Children("1. Ahmed", wb);
		Children c2 = new Children("2. Faisal", wb);
		Children c3 = new Children("3. Lulu", wb);
		Children c4 = new Children("4. Mall", wb);
		
		t.start();
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		
		
	}

}
