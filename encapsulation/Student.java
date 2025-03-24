package encapsulation;
import java.util.*;

public class Student {
	static Scanner sc = new Scanner(System.in);
	private String email,name,gender,branch;
	int age,password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public void fetch()
	{
		System.out.println("Name : "+name+" Email :"+email+" Gender: "+gender+" Branch : "+branch+" Age : "+age);
	}
	public void updateName(String email,int password,String name)
	{
		if((this.email.compareTo(email)==0) && this.password==password)
			this.name=name;
		else if(this.password !=password)
			System.out.println("Invalid Password");
		else
			System.out.println("Invalid Email");
	}
	public void updateEmail(String email,int password,String newEmail)
	{
		if((this.email.compareTo(email)==0) && this.password==password)
			this.email=newEmail;
		else if(this.password !=password)
			System.out.println("Invalid Password");
		else
			System.out.println("Invalid Email");
	}
	public void updateGender(String email,int password,String gender)
	{
		if((this.email.compareTo(email)==0) && this.password==password)
			this.gender=gender;
		else if(this.password !=password)
			System.out.println("Invalid Password");
		else
			System.out.println("Invalid Email");
	}
	public void updateAge(String email,int password,int age)
	{
		if((this.email.compareTo(email)==0) && this.password==password)
			this.age=age;
		else if(this.password !=password)
			System.out.println("Invalid Password");
		else
			System.out.println("Invalid Email");
	}
	public void updateBranch(String email,int password,String branch)
	{
		if((this.email.compareTo(email)==0) && this.password==password)
			this.branch=branch;
		else if(this.password !=password)
			System.out.println("Invalid Password");
		else
			System.out.println("Invalid Email");
	}
	public void updatePassword()
	{
		System.out.println("Enter current password");
		int temp = sc.nextInt();
		if(this.password == temp)
		{
			System.out.println("Enter the new password");
			int new1=sc.nextInt();
			System.out.println("Enter the new password again");
			int new2=sc.nextInt();
			if(new1 == new2)
				this.password=new1;
			else
				System.out.println("New password mis-match");
			
		}
	}

}
