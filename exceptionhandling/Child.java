package exceptionhandling;

public class Child extends Parent{
 void demo() throws ArithmeticException{
	 
 }
}
/* if super class method is throwing exception
*then the subclass overridden method must also throw the 
*same exception or the child type of that exception and not parent type
*/