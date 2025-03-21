package oops;

public class EmployeeDriver {
public static void main(String[] args) {
	Employee ob = new Employee(1,"Rit","Cap",10000);
	System.out.println(ob.id+" "+ob.name+" "+ob.companyName+" "+ob.salary);
}
}
