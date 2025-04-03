package method_overriding;

public class Driver {
public static void main(String[] args) {
	Dog d = new Dog();
	d.sound();
	Tiger t = new Tiger();
	t.sound();
	Animal a= new Dog(); //non-primitive upcasting
	String breed =((Dog)a).breed;
	System.out.println(breed);// non-primitive downcasting
	a.sound();
	
	Animal b= new Tiger(); //non-primitive upcasting
	b.sound();
}
}
