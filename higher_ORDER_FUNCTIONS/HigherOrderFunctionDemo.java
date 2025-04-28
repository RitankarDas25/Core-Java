package higher_ORDER_FUNCTIONS;
//they are functions which accept methods as its arguments
interface Demo{
	void print() ;
		
	
}

public class HigherOrderFunctionDemo {
	void greet (Demo d) {
		System.out.println(" from greet");
	d.print();

}
	public static void main(String[] args) {
		 HigherOrderFunctionDemo hof = new HigherOrderFunctionDemo();
	        hof.greet(() -> System.out.println("hello"));
	}
}