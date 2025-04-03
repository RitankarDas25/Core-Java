package university_management;

public class Driver {
public static void main(String[] args) {

	Person s1 = new Student("Ritz",22,1);
	Person s2 = new Student("Sona",23,2);
	Person s3 = new Student("raj",22,3);
	Person p1 = new Professor("vgjsad",65,"cse");
	Person p2 = new Professor("kjfda",40,"aiml");
	University iem = new University();
	iem.addPerson(s1);
	iem.addPerson(s2);
	iem.addPerson(s3);
	iem.addPerson(p1);
	iem.addPerson(p2);
	iem.showPeople();
}
}
