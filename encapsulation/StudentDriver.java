package encapsulation;
import java.util.*;
public class StudentDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student ob = new Student();
		int ch=0;
		for(int i=0;i<2;i++) {
		System.out.println("enter 1 to sign up and 2 to login and update");
		ch = sc.nextInt();
		sc.nextLine();
		switch(ch)
		{
		case 1 :
			System.out.println("enter name");
			String name = sc.nextLine();
			ob.setName(name);
			System.out.println("enter email");
			String email = sc.nextLine();
			ob.setEmail(email);
			System.out.println("enter age");
			int age = sc.nextInt();
			ob.setAge(age);
			sc.nextLine();
			System.out.println("enter gender");
			String gender=sc.nextLine();
			ob.setGender(gender);
			System.out.println("enter branch");
			String branch = sc.nextLine();
			ob.setBranch(branch);
			System.out.println("enter password");
			int password = sc.nextInt();
			ob.setPassword(password);
			ob.fetch();
			break;
		case 2 :
			System.out.println("enter email and password");
			String email1 = sc.nextLine();
			int password1 = sc.nextInt();
			sc.nextLine();
			System.out.println("enter new name");
			String name1 = sc.nextLine();
			ob.updateName(email1, password1, name1);
			System.out.println("enter new email");
			String email2 = sc.nextLine();
			ob.updateEmail(email1, password1, email2);
			email2=ob.getEmail();
			System.out.println("enter new age");
			int age1 = sc.nextInt();
			sc.nextLine();
			ob.updateAge(email2, password1, age1);
			System.out.println("enter new branch");
			String branch1 = sc.nextLine();
			ob.updateBranch(email2, password1, branch1);
			System.out.println("enter new password");
			ob.updatePassword();
			ob.fetch();
			break;
			default:
			System.out.println("Invalid choice");
				
			break;
		}
		}
		
	}

}
