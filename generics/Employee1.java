package generics;

public class Employee1 implements Comparable<Employee1>//Generics
{
int id;
String name;
public Employee1(int id,String name) {
	this.id=id;
	this.name=name;
}
public String toString() {
	return "[ id : "+this.id+" , name : "+this.name+" ]";
}
//public int compareTo(Object o) {
//	Employee e = (Employee) o;
//	return (int)(this.id-e.id);
//	
//}
@Override
public int compareTo(Employee1 o) {//no type casting needed

	return (int)(this.id-o.id);
}

public static void main(String[] args) {
	Employee1 e1 = new Employee1(1,"Rit");
	Employee1 e2 = new Employee1(2,"ditz");
	System.out.println(e1.toString());
	System.out.println(e2.toString());
	if(e1.compareTo(e2)>1) {
		System.out.println("e1 is greater");
	}
	else if(e1.compareTo(e2)<0) {
		System.out.println("e2 is greater");
		}
	else
		System.out.println("both are equal");

	
	}

}
