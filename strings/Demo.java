package strings;

public class Demo {
public static void main(String[] args) {
	String s1="hello";
	String s2="hello";
	System.out.println(s1==s2); // prints true as both s1 and s2 refer the same object
	System.out.println(s1.equals(s2));// compares values
	String s3 = new String ("hello");
	System.out.println(s1==s3); // prints false as new object s3 is created with is not same as s1 and s2
	System.out.println(s1.equals(s3)); //compare values
	s1+=" world";
	System.out.println(s1);
	System.out.println(s1.charAt(2));
	System.out.println(s1.contains(s2));
}
}
