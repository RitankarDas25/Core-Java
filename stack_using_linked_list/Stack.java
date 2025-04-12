package stack_using_linked_list;



public class Stack {
	Node top;

	public void push(int data) {
		Node newNode = new Node(data);
	    newNode.next = top;
	    top = newNode;
	    
		}
	
	public void display()
	{
		if(isEmpty()) {
			System.err.println("stack empty,no data to display");
		}
		else {
			Node current = top;
		        while (current != null) {
		        System.out.println(current.data );
		        current = current.next;
		      }
			}
	}
	
	public boolean isEmpty() {
		if(top== null)
			return true;
		else return false;
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
			 System.out.println("poped element:"+ top.data);
			    top = top.next;
			    return;
		}
	}
	public void peak()
	{if(isEmpty()==true)
		System.err.println("Stack is empty no element to show");
	else {
		
		System.out.println(top.data);
		
	}
}
}
