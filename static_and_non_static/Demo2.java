package static_and_non_static;

public class Demo2 {
public Demo2()
{
	System.out.println(Demo1.id);
	Demo1 ob = new Demo1();
	System.out.println(ob.name);
}
public static void main(String[] args) {
	System.out.println(Demo1.id);
	Demo1 ob = new Demo1();
	System.out.println(ob.name);
}

}

