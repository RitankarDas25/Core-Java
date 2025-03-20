package conditional_statements;
import java.util.*;
public class CalculatorApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a choice 1) for addition menu 2) for substraction 3) for multiplication menu 4) for division");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			Calculator.addMenu();
			break;
		case 2:
			Calculator.subtract();
			break;
		case 3:
			Calculator.multiplyMenu();
			break;
		case 4:
			Calculator.division();
			break;
		default:
			System.out.println("invalid choice");
			break;
		}
		
	}

}
