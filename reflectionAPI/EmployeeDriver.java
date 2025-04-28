package reflectionAPI;

import java.lang.reflect.Field;

public class EmployeeDriver {
public static void main(String[] args) throws Exception {
	Class<Employee> employee = Employee.class;
	Field[] fields = employee.getDeclaredFields();
	
	
	for(Field field : fields) {
		System.out.println(field.getName());
	}
	Employee e = new Employee(1,"Rohit",12000,26);
	Field f = employee.getDeclaredField("name");
	f.setAccessible(true);
	f.set(e, "ram");
	System.out.println(f.get(e));
}
}
