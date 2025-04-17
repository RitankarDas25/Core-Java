package generics;

public class Person {
	String name;
	int id;
	Person(String name,int id){
		this.id=id;
		this.name=name;
	}
public String toString() {
	return this.name+"  "+this.id;
}
}
