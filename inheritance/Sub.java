package inheritance;

public class Sub extends Super {
	String a ="yo";
	static String b ="honey";
	void print() {
		System.out.println(a);
		System.out.println(super.a);
		System.out.println(b);
		System.out.println(Super.b);
	}

}
