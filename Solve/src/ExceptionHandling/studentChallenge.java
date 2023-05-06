package ExceptionHandling;
//This program throws exception when stack is overflown or underflown
class stackUnderFlow extends Exception
{
	public String toString()
	{
		return "The stack has underflown";
	}
}

class stackOverFlow extends Exception
{
	public String toString()
	{
		return "The stack has overflown";
	}
}

class stack
{
	private int size;
	private int value[];
	private int top=-1;
	
	public stack(int size)
	{
		this.size = size;
		this.value = new int[size];
	}
	
	public void push(int value)
	{
		if(top > size-2)
		{
			try
			{
				throw new stackOverFlow();
			}
			catch(stackOverFlow e)
			{
				System.out.println(e);
			}
		}
		else
		{
			++top;
			this.value[top]=value;
			
		}
	}
	
	public void pop()
	{
		if(top < 0)
		{
			try
			{
				throw new stackUnderFlow();
			}
			catch(stackUnderFlow e)
			{
				System.out.println(e);
			}
		}
		else
		{
			this.value[top]= 0;
			--top;
		}
	}
	public void display()
	{
		for(int i =0; i<value.length ;i++)
		{
			System.out.println(value[i]);
		}
	}
}

public class studentChallenge {
	
	public static void main(String[] args)
	{
		stack s = new stack(5);
		
		s.push(1);
		s.push(2);
		s.push(4);
		s.push(5);
		s.push(5);
		
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		
		s.push(1);
		s.push(2);
		s.push(4);
		s.push(6);
		s.push(5);
		s.push(6);
		s.display();
		
		
	}

}
