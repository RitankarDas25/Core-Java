package one_to_many;

import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter array size");
	int size = sc.nextInt();
	Bank bank = new Bank(size,"SBI");
	boolean flag =true;
	while(flag) {
		System.out.println("Enter 1 to add customer \n enter 2 to display customer \n enter 3 to remove customer\n enter 4 to update customer \n enter 5 to find customer \n enter 6 to exit");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			sc.nextLine();
			System.out.println("enter name");
			String customerName=sc.nextLine();
			System.out.println("enter id");
			int id = sc.nextInt();
			Customer customer = new Customer(customerName,id);
			bank.addCustomer(customer);
			break;
		case 2:
			bank.displayCustomer();
			break;
		case 3:
			System.out.println("enter id");
			int id1 = sc.nextInt();
			bank.removeCustomer(id1);
			break;
		case 4:
			System.out.println("enter id");
			int id2 = sc.nextInt();
			sc.nextLine();
			System.out.println("enter new name");
			String name = sc.nextLine();
			bank.updateCustomer(name, id2);
			break;
		case 5:
			System.out.println("enter id");
			int id3 = sc.nextInt();
			System.out.println(bank.fetch(id3)+"found");
			break;
		case 6:
			flag = false;
			break;
		}
		}
	}
}

