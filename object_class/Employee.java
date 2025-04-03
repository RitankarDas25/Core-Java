package object_class;

public class Employee implements Cloneable {
int id;
String name;
double salary;
public Employee(int id,String name,double salary)
{
	this.id=id;
	this.name= name;
	this.salary= salary;
}
public boolean equals( Object o) {
	Employee e = (Employee) o;
	return this.id == e.id && this.salary == e.salary;
}
}
