package composition;

public class Driver {
public static void main(String[] args) {
	Car c = new Car("ferrari","V8");
	c.display();
	Phone p = new Phone("Iphone","500mha");
	p.display();
}
}
