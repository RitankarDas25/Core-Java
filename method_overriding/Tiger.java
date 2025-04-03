package method_overriding;

public class Tiger extends Animal{
public void sound() {
	super.sound();
	System.out.println("Tiger is roaring");
}
}
