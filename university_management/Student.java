package university_management;

public class Student extends Person {
	private int studentId;
	public Student(String name,int age,int studentId) {
		super(name, age);
		this.studentId=studentId;
		
	}
	public void showStudentGrade() {
		System.out.println("Student is in Grade 9");
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println(this.studentId);
		
	}
}
