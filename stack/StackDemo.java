package stack;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack st = new Stack();
	st.push(10);
	st.push(20);
	st.push(30);
	st.pop();
	System.out.println(st);
	System.out.println(st.search(20));
	System.out.println(st.get(0));
}
}
