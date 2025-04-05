package comparable_and_comparator;

public class Employee implements Comparable{
 int id;
private String name;
 double salary;
public Employee(int id,String name,double salary) {
	this.id=id;
	this.name=name;
	this.salary=salary;
}
public String toString() {
	return ("Employee id : "+this.id+" name : "+this.name+" salary : "+this.salary);
}
@Override
//public int compareTo(Object o)
//{
//	Employee e = (Employee)o;
//	return (int)(this.salary - e.salary);// comparing based on salary
//}
public int compareTo(Object o) {
	Employee e = (Employee)o;
	return this.name.compareTo(e.name);
}
}


