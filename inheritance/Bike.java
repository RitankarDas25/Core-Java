package inheritance;

public class Bike extends Vehicle{
	private boolean hasGear;
	Bike(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable,boolean hasGear) {
		super(vehicleNumber, brand, model, rentalPricePerDay, isAvailable);
		this.hasGear=hasGear;
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println(this.hasGear);
 }
}