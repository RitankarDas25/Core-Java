package exceptionhandling;

public class Demo {
public static void main(String[] args) {
	System.out.println("start");
	String str = null;
	try {
	str.toLowerCase();
	System.out.println(str);
	System.out.println(10/0);
	}
	catch(Exception e) 
	{
		System.out.println(e+" "+e.getMessage());
	}
	
	System.out.println("end");
}
}
