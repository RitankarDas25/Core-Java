package exceptionhandling;

public class ThrowsKeyword {
public static void div(int x,int y) throws Exception{
	System.out.println(x/y);
}
public static void main(String[] args) {
	try {
		div(10,0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
