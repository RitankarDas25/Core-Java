package co_variant_return_type;

public class Bike extends Vehicle {
	public Vehicle getObject() {
		return new Bike();
	}
}
