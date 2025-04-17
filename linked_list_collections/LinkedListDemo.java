package linked_list_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;



public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<Employee> arr = new LinkedList();


	arr.add(new Employee("ritz",1));
	arr.add( new Employee("sona",4));
	arr.add(new Employee("hur",3));
	Collections.sort(arr);
	System.out.println(arr);
	arr.push(new Employee("lol",2));
	LinkedList<Integer> list = new LinkedList();
	list.add(10);
	list.push(20);
	list.push(30);

	list.pop();
	System.out.println(list);            
}
}
