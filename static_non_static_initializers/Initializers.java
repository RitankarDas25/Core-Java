package static_non_static_initializers;

public class Initializers {

	static{
		System.out.println("1st static initializer");
	}
	static{
		System.out.println("2nd static initializer");
	}
	static{
		System.out.println("3rd static initializer");
	}
	public Initializers()
	{
		System.out.println("constructor");
	}
	{
		System.out.println("Non static initializer");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		Initializers db = new Initializers();
	}

}
