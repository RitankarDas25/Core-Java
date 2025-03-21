package oops;

public class StudentDriver {
public static void main(String[] args) {
	Students s1 = new Students("Ritz","IEM",1,90);
	Students s2 = new Students();
	System.out.println(s1.collegeName+" "+s1.id+" "+s1.name+" "+s1.marks);
	s1.study();
	System.out.println("------------------------------------------------");
	System.out.println(s2.collegeName+" "+s2.id+" "+s2.name+" "+s2.marks);
	s2.study();
}
}
