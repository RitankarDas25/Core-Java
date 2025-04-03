package method_overriding;

public class PartTimeEmployee extends Employee {
	private int workingHours;
	public PartTimeEmployee(String name,double salary,int workingHours) {
		super(name, salary);
		this.workingHours=workingHours;
	}
	public void employeeInfo() {
		super.employeeInfo();
		System.out.println(this.workingHours);
	}
	public void getDesignation()
	{
		System.out.println(" Employee is associate software Engineer");
	}
	public void jobRole() {
		System.out.println("job role of part time employee is cloud engineer");
	}

}
