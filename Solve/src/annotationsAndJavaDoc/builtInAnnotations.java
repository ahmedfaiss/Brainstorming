package annotationsAndJavaDoc;

import java.lang.annotation.*;

//This annotation will effect another annotation, there are 5
//1.Retention, 2.Documented, 3.Target, 4.Inherited, 5.Repeatable, these all are 
//useful upon user-defined annotations

@Retention(RetentionPolicy.CLASS)//This below annotation is retained in the class
//The exa annotation is available with class also, then we can fetch the meta data
//by using reflection, So this annotation will be available in compiled code

@Documented//If you use this then this below annotation will be provided on
//Documentation also, or in JavaDoc

@Target(value=ElementType.LOCAL_VARIABLE)//If you use this then the below annotation
// can used only for local variables, and you can't use it for class or method etc
//If you change to class then it will be useful for only class, also you can give
//array of type also

@Inherited //If I use this then in which class I write this for that class and also
//for its sub class it  is available

//@Repeatable(exa.class) -> this is useful for other purpose also, likewise
//@SuppressWarnings, A interface name.class should be written as parameter and
//interface should be made public or else you cant use this

@interface exa
{
	
}
@Target(value = {ElementType.LOCAL_VARIABLE, ElementType.METHOD})//you can also 
//have include others also, like only to local variable and method

@interface exa1
{
	
}
public class builtInAnnotations {

}
