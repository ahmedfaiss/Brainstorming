package Network;
import java.net.*;
import java.io.*;






public class usingMultiThreadReverseEcho extends Thread{
	Socket skt;
	
	public usingMultiThreadReverseEcho(Socket st)
	{
		skt = st;
	}
	
	public void run()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
			PrintStream ps = new PrintStream(skt.getOutputStream());
			
			String msg;
			StringBuffer sb;
			
			do
			{
				msg = br.readLine();
				
				sb = new StringBuffer(msg);
				sb.reverse();
				msg = sb.toString();
				
				ps.println(msg);
				
			}while(!msg.equals("dne"));	
			
			skt.close();
		}
		
		catch(Exception e) {}
	}
	
	public static void main(String[] args) throws Exception
	{
		int count = 1;
		ServerSocket ss = new ServerSocket(2000);
		Socket skt;
		
		do
		{
			skt = ss.accept();
			
			System.out.println("Conection : "+count++);
			
			usingMultiThreadReverseEcho r = new usingMultiThreadReverseEcho(skt);
			r.start();
			
		}while(true);
		
	}
}

class clientEcho
{
	public void method() throws Exception
	{
		Socket skt = new Socket("localhost",2000);
		
		BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
		PrintStream ps =  new PrintStream(skt.getOutputStream());
		
		String msg;
		
		do
		{
			msg = keyb.readLine();
			
			ps.println(msg);
			
			msg = br.readLine();
			
			System.out.println("From Server : "+msg);
			
		}while(!msg.equals("dne"));
	}
}
