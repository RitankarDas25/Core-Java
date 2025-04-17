package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class EmployeeDriver {
public static void main(String[] args) {
	ArrayList<Employee> arr = new ArrayList();


	arr.add(new Employee("ritz",1));
	arr.add( new Employee("sona",2));
	arr.add(new Employee("hur",3));
	
	System.out.println(arr);
//	for(Employee e : arr) {
//		System.out.println(e);
//	}
	Iterator<Employee> itr = arr.iterator();
	while(itr.hasNext()) {
		Employee x =itr.next();
		if(x.name.equals("sona"))
			itr.remove();
		
	}
	System.out.println(arr);
	
//list iterator
	ListIterator<Employee> list =arr.listIterator();
	while(list.hasNext()) {
		System.out.println("Index :"+list.nextIndex()+" Element "+list.next());
	}
	//resetting curser back to first
	while(list.hasPrevious()) {
		list.previous();
	}
	while(list.hasNext()) {
		int index = list.nextIndex();
		if(index==1) {
			list.add(new Employee("lol",2));
		}
		Employee x = (Employee)list.next();
		if(x.name.equals("ritz")) {
			//list.set(x.name="rito");
		}
	}
	ArrayList<Integer> ab = new ArrayList();
	ab.add(10);

	ab.add(6);
	ab.add(9);
	ab.add(2);
	System.out.println(ab);
	Collections.sort(ab);
	System.out.println(ab);
	Collections.sort(arr);
	System.out.println(arr);
	
}
}
