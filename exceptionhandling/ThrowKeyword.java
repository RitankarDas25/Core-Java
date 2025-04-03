package exceptionhandling;

public class ThrowKeyword {
	public static void div(int x,int y) throws Exception {
		if(y!=0)
			System.out.println(x/y);
		else 
			throw new Exception("Denominator is zero");
	}
public static void main(String[] args) {
	try {
		div(10,0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
}
}
