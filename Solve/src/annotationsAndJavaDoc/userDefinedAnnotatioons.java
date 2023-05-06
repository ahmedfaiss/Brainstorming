package annotationsAndJavaDoc;

//user defined annotations are same as interface but a slight change that is -> 
// you should have @ symbol before interface as shown below
import java.lang.annotation.Annotation;//annotation_package.Annotation_class

//always annonations are extending from annotation class

@interface eg
{
	
}
@eg//we can use annotations for class
public class userDefinedAnnotatioons {
	@eg//for instance variables
	int a;
	@eg//for methods
	public static void main(@eg String[] args )//for parameters
	{
		@eg//for local variables
		int l;
		
		//But empty annotations are no useful
		//Below I will show elements inside annotations
	}

}

@interface eg1
{
	//It is better to use string than other data types and, elements should't have
	//any parameters 
	String name();
	String date() default "1/1/2000";
	String version() default "13";
	//so if you write the elements then that elements should be written inside
	//annotations when using the annotations as shown below
}

@eg1(name="Faisal",date = "1/1/1000",version="13")//you have to write all the
//parameters inside annotations like this
class show
{
	@eg1(name="Faisal",date="1/1/2001")//here you can see if you don't write version
	//it is not throwing an error because, you have given a default value, So 
	//if you give like that in elements itself then either you can include the 
	//elements inside annotations or you can avoid, but you can't avoid using name
	//because there is no default value in the interface
	public void show1(int a)
	{
		
	}
}

