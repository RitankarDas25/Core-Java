package queue_using_linked_list;
import java.util.Scanner;



public class Driver {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//System.out.println("enter size of queue");
	//int size = sc.nextInt();
	Queue queue = new Queue();
		boolean flag = true;
		while(flag) {
			System.out.println("enter 1 to display, 2 to enqueue, 3 to dequeue , 4 to check empty, 5 to display peak, 6 to exit");
			int ch = sc.nextInt();

		switch(ch) {
		case 1:
			queue.display();
			break;
		case 2:
			System.out.println("enter data");
			int data = sc.nextInt();
			queue.enqueue(data);
			break;
		case 3:
			queue.dequeue();
			break;
		case 4:
			System.out.println( queue.isEmpty());
			break;
		case 5:
			queue.peak();
			break;
		case 6:
			flag = false;
			break;
		}
	}
}
}