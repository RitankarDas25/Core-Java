package acess_modifiers;

public class Child extends Parent{
	void validate() {
		System.out.println(Parent.a);
		//System.out.println(Parent.b); b is private
		Parent.print();
	}

}
