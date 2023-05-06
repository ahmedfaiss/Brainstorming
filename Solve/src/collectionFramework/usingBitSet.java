package collectionFramework;
import java.util.BitSet;

class bitSet
{
	public void method() 
	{
		BitSet bs = new BitSet();
		
		bs.set(0);//this set the index true
		bs.set(1);
		bs.set(2);
		bs.set(3);
		bs.set(4);
		
		bs.flip(4);//It will flip the index 4 to false that is 0
		
		System.out.println(bs);//will print from 0 to 3
		
		BitSet bs1 = new BitSet();
		bs1.set(4);
		bs1.set(5);
		bs1.set(6);
		bs1.set(7);
		bs1.set(8);
		
		bs.or(bs1);//will flip bs to true for all 8 bit, there is no 8 bit in bs but when you do or with bs and bs1, then 4 to 8 in bs1 is true and
		//4 to 8 in bs is false(that is it is not set so ot is false), when I make or then 4 to 8 will be set(because 0 or 1 is 1)
		
		System.out.println(bs);
		//you can also do AND, XOR and many methods are present in BitSet
		
		
	}
}

public class usingBitSet {
	public static void main(String [] args)
	{
		bitSet s = new bitSet();
		s.method();
	}

}
