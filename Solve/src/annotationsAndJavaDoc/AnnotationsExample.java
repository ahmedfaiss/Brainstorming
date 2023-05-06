package annotationsAndJavaDoc;

import java.util.*;//this is for implementing List

//Annotations are used for giving attributes of a class or  interface or methods
//It is useful for getting meta data, meta data means data  about data
//for example: if you want to know who wrote the class, for which project he has 
//written the class, and this class belongs to which package etc, If you want to 
//get these informations you can put it in a annotation

//1. Annotation of code -> It is set of annotations that is applied on the code
//this type of annotations gives hint to the compiler, So it avoids showing you 
//errors or warning, this are little diff from meta data and also has effect on code
//2. Applied to other annotations, it is applied on user defined annotations

//inbuilt annotations in java -> 1.@Override 2.@Deprecated 3.@FunctionalInterface
//4.SuppressWarning 5.SafeVarargs

//1. @Override -> helps you you whether you have overrided super class methods
//or not, Suppose For Ex: class A{public void display(){}} and class B extends A{
// public void displya()}, If you see I didn't override super class methods, but
//I will not know, I will think that it is overrided and compiler thinks that
//it is some other method, So to avooid this, we have to write @Override above the
//overriding method

class Annotation
{
	public void display() {}
}

class annotation_Ex extends Annotation
{
	@Override//If you dont over ride it will give an error
	
	public void display() {}
}

class Deprecation_example
{
	@Deprecated
	public void show()
	{
		System.out.println("Deprecate annotation will say that it is not reco"
				+ "mmended to use and while calling this method it will show as"
				+ "striked");
	}
}
public class AnnotationsExample {
	
	static List l;//creating a list interface, this is for unchecked SuppressWarnings
	
	@SuppressWarnings("unchecked")//suppresses unchecked warnings
	public static void main(String[] args)
	{
		Deprecation_example d = new Deprecation_example();
		d.show();//as you can see it shows as striked out
		
		@SuppressWarnings("Deprecation")//it is saying that, I know I am using
		//deprecation methods, but dont show me that warning, It stops sending
		//warnings
		Deprecation_example d1 = new Deprecation_example();
		d1.show();
		
		//we can also use suppress for unchecked warnings for Ex below
		
		
		
		
		l.add(10);//I am calling method without creating the object
		
	}

}

class M<T>
{
	@SafeVarargs//It can suppress only private method or final method and for 
	//variable arguments here I am taking generic as variable arguments, So it is
	//not safe to use it
	private void display(T...arg )
	{
		for(T x:arg)
		{
			System.out.println(x);
		}
		
	}
}

//If a interface has a single method then it is called as functional interface
//and for lambda expressions, interface should have only one method in
//interface for this purpose you can use @FunctionalInterface annotations

@FunctionalInterface
interface Exxxample
{
	public void delay();
	
}

