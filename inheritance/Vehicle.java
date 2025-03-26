package inheritance;

public class Vehicle {
	private String vehicleNumber,brand,model;
	private double rentalPricePerDay;
	private boolean isAvailable;
	 Vehicle(String vehicleNumber, String brand,String model,double rentalPricePerDay,boolean isAvailable){
		 this.vehicleNumber=vehicleNumber;
		 this.brand=brand;
		 this.model=model;
		 this.rentalPricePerDay=rentalPricePerDay;
		 this.isAvailable=isAvailable;
	 }
		public void displayDetails()
		{
			System.out.print(this.vehicleNumber+" "+this.brand+" "+this.model+" "+this.rentalPricePerDay+" "+this.isAvailable+" ");
	 }
		public void rentVehicle(boolean isAvailable) {
			if(isAvailable)
			{
				System.out.println("can be rented");
			}
			else System.out.println("cannot be rented");
		}
}
