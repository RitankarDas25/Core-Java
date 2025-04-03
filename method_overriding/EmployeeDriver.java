package method_overriding;

public class EmployeeDriver {
	static void details(Employee e) {
		if(e instanceof FullTimeEmployee)
		e.jobRole();
		else {
		((PartTimeEmployee)e).getDesignation();
		((PartTimeEmployee)e).jobRole();
		}
	}
public static void main(String[] args) {
	Employee e1 = new FullTimeEmployee("Ritz",10000.00,1000); //up casting
	Employee e2 = new PartTimeEmployee("Raj",8000.00,35);
	e1.employeeInfo();
	e2.employeeInfo();
	//((FullTimeEmployee) e1).jobRole(); // down casting 
	//((PartTimeEmployee)e2).getDesignation();  //down casting
	EmployeeDriver.details(e1);
	EmployeeDriver.details(e2);
	
}
}
