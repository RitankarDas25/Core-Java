package acess_modifier_demo;

import acess_modifiers.Parent;

public class Demo extends Parent{
	static void check() {
		System.out.println(Parent.a);
	//	System.out.println(Parent.b); b is private
		Parent.print();
	}
}
