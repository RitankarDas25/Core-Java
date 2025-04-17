package tree_set;

import java.util.TreeSet;

public class EmployeeDriver {
public static void main(String[] args) {
	TreeSet <Employee> employee=new TreeSet(new ComparatorHelp());
	employee.add(new Employee("ritz",1000));
	employee.add(new Employee("arohi",2000));
	System.out.println(employee);
	
}
}
