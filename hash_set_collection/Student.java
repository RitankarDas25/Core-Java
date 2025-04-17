package hash_set_collection;

import java.util.Objects;

public class Student {
String name;
int id;
Student(String name,int id){
	this.id=id;
	this.name=name;
}
public String toString() {
	return this.name+"  "+this.id;
}
public boolean equals(Object o) {
	Student s =(Student)o;
	return this.id==s.id && Objects.equals(name,s.name);
}
public int hashCode() {
	return Objects.hash(id,name);
}
}
