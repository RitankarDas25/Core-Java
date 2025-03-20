package conditional_statements;
import java.util.*;

public class Calculator {
	static Scanner sc = new Scanner(System.in);
	public static double add(double a,double b)
	{
		return (a+b);
	}
	public static double add(double a,double b,double c)
	{
		return (a+b+c);
	}
	public static void addMenu()
	{
		System.out.println("enter 1) to add 2 numbers 2) to add 3 numbers");
		int ch = sc.nextInt();
		switch(ch){
		case 1:
			System.out.println("enter 2 numbers");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			System.out.println(add(a,b));
			break;
		case 2:
			System.out.println("enter 3 numbers");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			System.out.println(add(x,y,z));
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}
	public static double subtract()
	{
		System.out.println("enter 2 numbers");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		return (a-b);
	}
	public static double multiply(double a,double b)
	{
		return (a*b);
	}
	public static double multiply(double a,double b,double c)
	{
		return (a*b*c);
	}
	public static void multiplyMenu()
	{
		System.out.println("enter 1) to multiply 2 numbers 2) to multiply 3 numbers");
		int ch = sc.nextInt();
		switch(ch){
		case 1:
			System.out.println("enter 2 numbers");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			System.out.println(multiply(a,b));
			break;
		case 2:
			System.out.println("enter 3 numbers");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			System.out.println(multiply(x,y,z));
			break;
		default:
			System.out.println("Invalid choice");
		}
	}
	public static double division()
	{
		System.out.println("enter 2 numbers");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		return (a/b);


}
}
