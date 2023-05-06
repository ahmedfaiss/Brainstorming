package Network;
import java.net.*;
import java.io.*;


public class ReverseEcho {
	public void mehtod() throws IOException
	{
		ServerSocket ss = new ServerSocket(2000);//2000 is port number 
		Socket stk = ss.accept();//Server is accepting and it returns Socket so you should take in a Socket reference, when client connect the accept
		//method will accept the request and it will attach it in this Socket
		
		BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));//Bufferedreader reader the character but we are getting
		//a stream so to take that stream of inpuut and convert to  Reader we are using InputStreamReader from Socket Stk, we are using BufferedReader
		//because we can read a complete line
		
		PrintStream ps = new PrintStream(stk.getOutputStream());//To print the output to the client
		
		
		String msg ;//It should read a message from a client
		StringBuffer sb;//this is to reverse the message
		
		do
		{
			msg = br.readLine();//to read the whole line of the messge that client sent
			
			sb= new StringBuffer(msg);
			sb.reverse();//reversing the message
			msg = sb.toString();//converting it ti string again and storing in the msg
		
			ps.println(msg);//printing  the message
		}while(!msg.equals("dne"));
		
	}
}

class Client
{
	public static void main(String[] args) throws Exception
	{
		ReverseEcho r = new ReverseEcho();
		r.mehtod();
		Socket stk = new Socket("localhost",2000);//as this is a client software, So we have to write a Socket itself but not SocketServer, as this is
		//a same computer we can use as localhost but if both are different then IP address should be provided in the place of localhost,
		//now this stk will be connecting to the server
		
		BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));//to read from the keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));//to read from the server
		PrintStream ps = new PrintStream(stk.getOutputStream());//to print
		
		String msg;
		
		do
		{
			msg = keyb.readLine();//reading from the keyboard
			ps.println(msg);//passing to the server
			
			msg = br.readLine();//reading from the server after reversing
			
			System.out.println("From Server "+msg);		
		}while(!msg.equals("dne"));	
	}
}


