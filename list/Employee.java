package list;

public class Employee implements Comparable{
String name ;
int id;
Employee(String name,int id){
	this.id=id;
	this.name=name;
}
public String toString() {
	return this.name+" "+this.id;
}
@Override
public int compareTo(Object o) {
	Employee e =(Employee)o;
	return(this.id-e.id) ;
}

}
