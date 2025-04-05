package wrapper_class;

public class Demo {
	public static void main(String[] args) {
		
	
int a =20;
Integer i = new Integer(a); // deprecated
 System.out.println(i);
Short s = new Short((short)10); // deprecated
System.out.println(s);
//new syntax below
Integer x =a;
Integer c =a;// auto boxing
Integer z =Integer.valueOf(a);
System.out.println(x);
System.out.println(z);
Integer.reverse(z);
System.out.println(z);
Short y = 10; // auto boxing
System.out.println(y);
int b = z.intValue();// unboxing
Short e = s; // auto unboxing
System.out.println(c==x);
	}

}
