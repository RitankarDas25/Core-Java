package mock_test;

import java.util.Iterator;
import java.util.List;



@SecurityCheck(role = "Admin")
public class Admin extends User {
	Class<SecurityCheck> c = SecurityCheck.class;
	SecurityCheck s =c.getDeclaredAnnotation(SecurityCheck.class);
	public Admin(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showProfile() {
		// TODO Auto-generated method stub
		System.out.println("Admin Details");
		System.out.println("Admin name :"+this.name+" Role : "+s.role());
	}
	 public static void removeDriver(List<Driver> drivers, String driverId) {
	        try {
	            
	            Class<Admin> adminClass = Admin.class;
	            if (adminClass.isAnnotationPresent(SecurityCheck.class)) {
	                SecurityCheck securityCheck = adminClass.getAnnotation(SecurityCheck.class);
	                if ("Admin".equals(securityCheck.role())) {
	                    
	                    Iterator<Driver> iterator = drivers.iterator();
	                    while (iterator.hasNext()) {
	                        Driver driver = iterator.next();
	                        if (driver.id.equals(driverId)) {
	                            iterator.remove();
	                            System.out.println("Driver with ID " + driverId + " removed.");
	                            return;
	                        }
	                    }
	                    System.out.println("Driver with ID " + driverId + " not found.");
	                } else {
	                    System.out.println("Access denied: Incorrect role.");
	                }
	            } else {
	                System.out.println("Access denied: No security annotation present.");
	            }
	        } catch (Exception e) {
	            System.out.println("An error occurred while removing the driver: " + e.getMessage());
	        }
	    }
	}
	








	


