package reflectionAPI;

public class Employee {
	private int id;
	private int salary;
private String name;
private int age;
public Employee(int id,String name,int salary,int age) {
	this.id=id;
	this.name=name;
	this.salary=salary;
	this.age=age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return this.name+" "+this.age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

}
