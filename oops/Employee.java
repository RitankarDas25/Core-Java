package oops;

public class Employee {
	int id;
	String name,companyName;
	double salary;
	public Employee()
	{
		id =0;
		name="";
		companyName= "";
		salary =0;
	}
	public Employee(int id)
	{
		this.id =id;
	}
	public Employee(int id,String name)
	{
		this(id);
		this.name=name;
	}
	public Employee(int id,String name,String companyName)
	{
		this(id,name);
		this.companyName=companyName;
	}
	public Employee(int id,String name,String companyName,double salary)
	{
		this(id,name,companyName);
		this.salary=salary;
	}
}
