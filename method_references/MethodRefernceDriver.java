package method_references;

public class MethodRefernceDriver {
public static void main(String[] args) {
	Demo d = System.out::println;
	d.print("hello");
	// nonj static method
	
}
}
