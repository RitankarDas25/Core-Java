package stack_using_array;

public class Stack {
int size;
int top=-1;
int []stack;
public Stack(int size) {
	this.size=size;
	stack = new int[size];
}
public void display() {
	if(top==-1) {
		System.out.println("stack is empty");
		return;
	}
	else
	{
		for(int i=0;i<=top;i++)
			System.out.println(stack[i]);
	}
}
public void push(int data)
{
	if(top == (size -1))
		{System.err.println("Stack Overflow");
		return;
		}
	else
	{
		stack[++top]=data;
	}
}
public void pop()
{
	if(isEmpty()== true)
	{
		System.err.println("Stack Underflow");
		return ;
	}
	else
	{
		System.out.println("poped element :"+stack[top--]);
	return;
	}
}
public void peak()
{if(isEmpty()==true)
	System.err.println("Stack is empty no element to show");
else
	System.out.println(stack[top]);
}
public boolean isEmpty() {
	if(top==-1)
		return true;
	else return false;
}
}
