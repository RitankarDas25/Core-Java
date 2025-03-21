package oops;

public class Students {
	int id;
	String name,collegeName;
	double marks;
	public Students()
	{
		System.out.println("this is no-arg constructor");
	}
	public Students(int id,String name) // CONSTRUCTOR OVERLOADING
	{
		this.id = id;
		this.name = name;
	}
	public Students(String name,String collegeName,int id,double marks) {
		this(id,name); // CONSTRUCTOR CHAINING - It calls the above constructor

		this.collegeName =collegeName;
		
		
		this.marks=marks;
	}
	public void study()
	{
		System.out.println("Student is Studing");
	}
}

