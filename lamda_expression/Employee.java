package lamda_expression;

public class Employee implements Comparable{
int id;
String name;
public Employee(int id,String name) {
	this.id=id;
	this.name=name;
}
public String toString() {
	return this.name+" "+this.id;
}
@Override
public int compareTo(Object o) {
	Employee e = (Employee)o;
	return this.id - e.id;
	
}

}
