package mock_test;

public class Driver extends User {
	private boolean available =true;

	public Driver(String id, String name, boolean available) {
		super(id, name);
		this.available=true;
		// TODO Auto-generated constructor stub
	}
	public boolean isAvailable() {
		if(available==true)
			return true;
		else
			return false;
	}
	public void setAvailable(boolean available) {
		this.available=available;
	}
	@Override
	public void showProfile() {
		// TODO Auto-generated method stub
		System.out.println("Driver Details:");
		System.out.println("Driver Name : "+this.name);
	}

}
