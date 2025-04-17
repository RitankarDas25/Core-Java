package tree_set;

import java.util.Comparator;



public class Employee implements Comparable{
String name;
int salary;
Employee(String name,int salary){
	this.name=name;
	this.salary=salary;
}
public String toString() {
	return this.name+"  "+this.salary;
}
@Override
public int compareTo(Object o) {
	Employee e = (Employee)o;
	return this.salary-e.salary;
}
}
class ComparatorHelp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2 =(Employee)o2;
		return e2.salary-e1.salary;
	}
	
}
