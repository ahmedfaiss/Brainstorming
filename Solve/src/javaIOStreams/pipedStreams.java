package javaIOStreams;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

//piped stream means connecting the streams i.e output stream and input stream
//This program has producer who writes the value and passes using output streamand consumer consumes the value by using
//input stream

class producer extends Thread
{
	OutputStream os;
	
	public producer (OutputStream o)
	{
		os= o;
	}
	
	public void run()
	{
		try
		{
			int count = 1;
			while(true)
			{
				os.write(count);//to read value you should use inputstream and connect it through pipe in main methos
				os.flush();
				currentThread().sleep(10);
				count++;
				
				System.out.println("Producer "+count);
				System.out.flush();
				
				
			}				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}

class consumer extends Thread
{
	InputStream is;
	
	public consumer(InputStream i)
	{
		is = i;
	}
	
	public void run()
	{
		try
		{
			int x;
			while(true)
			{
				x = is.read();//reads from the outputstream by connecting through pipe in main method
				
				System.out.println("Consumer "+x);
				System.out.flush();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


public class pipedStreams {
	public static void main(String[] args) throws Exception
	{
		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream();
		
		pos.connect(pis);//you have to throw exception or write inside try catch block
		
		producer p = new producer(pos);
		consumer c = new consumer(pis);
		
		
		
		p.start();
		c.start();
		
		
	}

}
