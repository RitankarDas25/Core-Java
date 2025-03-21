package static_and_non_static;

public class Demo1 {
	static int id =10;
	String name ="raj";
public Demo1()
{
System.out.println(id);
System.out.println(name);
}
public static void main(String[] args) {
	Demo1 ob= new Demo1();
	System.out.println(id);
	System.out.println(ob.name);
}
}
