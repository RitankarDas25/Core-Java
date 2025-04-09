package singly_linked_list;

import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	SinglyLinkedList list = new SinglyLinkedList();
	boolean flag =true;
	while(flag) {
		System.out.println("enter 1 to insert ,2 to display data,3 to update data,4 to insert at index,,5 to delete at index, 6 to exit");
		int ch =sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("enter data");
			int data = sc.nextInt();
			list.insert(data);
			break;
		case 2 :
			list.display();
			break;
		case 3:
			System.out.println("enter index");
			int index =sc.nextInt();
			System.out.println("enter data");
			int data1 = sc.nextInt();
			list.updateData(index, data1);
			break;
		case 4:
			System.out.println("enter index");
			int index1 =sc.nextInt();
			System.out.println("enter data");
			int data2 = sc.nextInt();
			list.insertPosition(index1, data2);
			break;
		case 5:
			System.out.println("enter index");
			int index2 =sc.nextInt();
			list.deletePosition(index2);
			break;
		case 6:
			flag = false;
			break;
		}
	}
}
}
