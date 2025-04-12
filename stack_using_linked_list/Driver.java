package stack_using_linked_list;
import java.util.Scanner;
public class Driver {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	System.out.println("enter size of stack");
//	int size = sc.nextInt();
	Stack stack = new Stack();
		boolean flag = true;
		while(flag) {
			System.out.println("enter 1 to display, 2 to push, 3 to pop , 4 to check empty, 5 to display peak, 6 to exit");
			int ch = sc.nextInt();

		switch(ch) {
		case 1:
			stack.display();
			break;
		case 2:
			System.out.println("enter data");
			int data = sc.nextInt();
			stack.push(data);
			break;
		case 3:
			stack.pop();
			break;
		case 4:
			System.out.println( stack.isEmpty());
			break;
		case 5:
			stack.peak();
			break;
		case 6:
			flag = false;
			break;
		}
	}
}
}
