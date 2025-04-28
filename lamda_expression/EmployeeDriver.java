package lamda_expression;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class EmployeeDriver {
public static void main(String[] args) {
	ArrayList<Employee> employee = new ArrayList();


	employee.add(new Employee(1,"ritz"));
	employee.add( new Employee(5,"sona"));
	employee.add(new Employee(3,"hur"));
	
	System.out.println(employee);
	Comparator<Employee> c =(o1,o2) -> o1.id -o2.id;
	Collections.sort(employee,c);
	System.out.println(employee);
}
}
