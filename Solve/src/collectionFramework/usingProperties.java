package collectionFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//this is extending from Hashtable 

class property
{
	public void method() throws FileNotFoundException, IOException
	{
		Properties p = new Properties();//This class stores both key and value as String, and no need to intialize it here
		
		/*
		 *  p.setProperty("Brand", "MAcBook");
			p.setProperty("RAM", "256GB");
			p.setProperty("Os", "IOS");
			p.setProperty("Price", "1000000");
			*/
		
		
		//p.store(new FileOutputStream("C:/JavaFiles/property.txt"), "Laptop");//creates a file with the values, word Laptop will be stored in the file
		//has heading
		
		//p.storeToXML(new FileOutputStream("C:/JavaFiles/property1.xml"),"Laptop" );
		
		//now I will modify in the file and load here using FileInputStream
		
		p.load(new FileInputStream("C:/JavaFiles/property.txt"));
		
		//to getproperty we have to comment the storing one because when ever i give run the values will be again changed in the file, which I 
		//modified in the same property.txt
		
		System.out.println(p.getProperty("Name"));
		System.out.println(p.getProperty("Color"));
		
		//you can also modify in the XML sheet but my laptop isn't allowing to modify
		
		
	}
}
 
public class usingProperties {
	public static void main(String [] args) throws Exception {
		property p = new property();
		p.method();
	}

}
