package comparable_and_comparator;

public class EmployeeDriver {
	public static void main(String[] args) {
		
	
Employee e1 = new Employee(1,"ditz",1000);
Employee e2 = new Employee(2,"ditz",1000);
System.out.println(e1.toString());
System.out.println(e2.toString());
if(e1.compareTo(e2)>1) {
	System.out.println("e1 is greater");
}
else if(e1.compareTo(e2)<0) {
	System.out.println("e2 is greater");
	}
else
	System.out.println("both are equal");

	CompareEmployeeById ob = new CompareEmployeeById();
	
	if(ob.compare(e1, e2)>1) {
		System.out.println("e1 is greater");
	}
	else if(ob.compare(e1, e2)<0) {
		System.out.println("e2 is greater");
		}
	else
		System.out.println("both are equal");

}
}
