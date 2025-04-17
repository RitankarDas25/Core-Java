package hash_set_collection;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		
	
HashSet s = new HashSet();

s.add(null);
s.add(10);
s.add("hello");
System.out.println(s);
HashSet <Student> student = new HashSet();
student.add(new Student("A",1));
student.add(new Student("A",1));
System.out.println(student);
}
}