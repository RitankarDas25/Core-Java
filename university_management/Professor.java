package university_management;

public class Professor extends Person {
	private String specialization;
	public Professor(String name,int age,String specialization) {
		super(name, age);
		this.specialization=specialization;
		
	}
	public void getDesignation() {
		System.out.println("Professor designation is hod");
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println(this.specialization);
	}
}
