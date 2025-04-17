package list;

import java.util.ArrayList;

public class ArrayListMethods {
public static void main(String[] args) {
	ArrayList a1= new ArrayList();
	//add element
	a1.add(10);
	a1.add(20);
	a1.add(30);
	
	System.out.println(a1);
	
	ArrayList list = new ArrayList();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add("hello");
	list.addAll(a1); // add 2 arraylist
	System.out.println(list);
	System.out.println(list.size());
	
	System.out.println(list.get(3));
	
}
}
