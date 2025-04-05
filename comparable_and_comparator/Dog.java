package comparable_and_comparator;
import java.util.*;
class CompareByBreed implements Comparator{
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Dog d1=(Dog)o1;
		Dog d2=(Dog)o2;
		
		return d2.breed.compareToIgnoreCase(d1.breed);
}
}
public class Dog {//implements Comparable {
String name ;
String breed;
int age;
public Dog(String name,int age,String breed) {
	this.name=name;
	this.age=age;
	this.breed=breed;
}
public String toString()
{
	return ("name :"+this.name+" Age :"+this.age+" Breed: "+this.breed);
}
public int compareTo(Object o) {
	Dog d = (Dog)o;
	if(this.name.compareToIgnoreCase(d.name)!=0)
		return this.name.compareToIgnoreCase(d.name);
	if(this.age-d.age !=0)
		return this.age-d.age;
	else
		return 0;
}
public static void main(String[] args) {
	Dog[] dog = new Dog[3];
	dog[0] = new Dog("King",10,"Lab");
	dog[1] = new Dog("Lucifer",8,"Golden");
	dog[2] = new Dog("Lara",12,"German");
	CompareByBreed ob = new CompareByBreed();
	Arrays.sort(dog,ob);
	for(int i=0;i<dog.length;i++)
	{
		System.out.println(dog[i].toString());
	}
}
}
