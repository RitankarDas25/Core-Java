package method_overriding;

public class Employee {
private String name;
private double salary;
public Employee(String name,double salary) {
	this.name=name;
	this.salary=salary;
}
public void employeeInfo() {
	System.out.print(this.name+" "+this.salary+" ");
}
public void jobRole() {

}
}
