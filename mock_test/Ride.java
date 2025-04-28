package mock_test;

public class Ride {
private Customer customer;
private Driver driver;
private String status;

public Ride(Customer customer,Driver driver,String status) {
	this.customer=customer;
	this.driver=driver;
	this.status="Booked";
}
public void completeRide() {
	this.status="Completed";
	this.driver.setAvailable(true);
}
public String getStatus() {
	return this.status;
}
public String rideDetails() {
	return "Customer Name: "+this.customer.name+" Driver Name : "+this.driver.name+" Current Status : "+this.status;
}
}