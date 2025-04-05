package comparable_and_comparator;

public class PersonDriver {
public static void main(String[] args) {
	Person p1 = new Person("Rohit",24);
	Person p2 = new Person("Rohit",26);
	int ans = p1.compareTo(p2);
	if(ans==-2)
		System.out.println("name of p2 is greater");
	else if(ans==2)
		System.out.println("name of p1 is greater");
	else if(ans ==-1)
		System.out.println("name are same but p2 is older");
	else if(ans ==1)
		System.out.println("name are same but p1 is older");
	else
		System.out.println("name and age both are same");
		
}
}
