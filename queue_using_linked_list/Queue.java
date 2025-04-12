package queue_using_linked_list;



public class Queue {
	
		Node front=null;
		Node rear=null;
		public void display() {
			if(rear==null) {
				System.err.println("queue is empty");
				return;
			}
			else
			{Node temp = front;
				while(temp!=null)
					{System.out.println(temp.data);
					temp=temp.next;
					}
			}
		}

		public void enqueue(int data) {
			Node newNode = new Node(data);
			if(front == null && rear == null) {
				front=newNode;
				rear=newNode;
				rear.next=null;
				return;
			}
			else {
		    rear.next=newNode;
		    rear=rear.next;
			}
			}
		public boolean isEmpty() {
			if(front == null ||(front == null && rear ==null))
				return true;
			else return false;
		}
		public void dequeue()
		{
			if(isEmpty()== true)
			{
				System.err.println("Queue is empty");
				front =null;
				rear=null;
				return ;
			}
			else
			{
				System.out.println("dequeued element :"+front.data);
				front=front.next;
			return;
			}
		}
		public void peak()
		{if(isEmpty()==true)
			System.err.println("Stack is empty no element to show");
		else
			System.out.println(front.data);
		}
}
