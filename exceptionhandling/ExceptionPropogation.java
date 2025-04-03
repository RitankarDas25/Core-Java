package exceptionhandling;

public class ExceptionPropogation {
	public static void alpha() {
		System.out.println("this is alpha");
		beta();
	}
	public static void beta() {
		System.out.println("this is beta");
		gamma();
	}
	public static void gamma() {
		System.out.println("this is gamma");
		System.out.println(10/0);
	}
public static void main(String[] args) {
	System.out.println("this is main");
	alpha();
}
}
