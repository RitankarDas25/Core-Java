package mock_test;

public class Customer extends User {

	public Customer(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showProfile() {
		// TODO Auto-generated method stub
		System.out.println("Customer Details:");
		System.out.println("Customer Name: "+this.name);
	}

}
