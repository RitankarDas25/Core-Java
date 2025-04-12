package queue_array;

public class Queue {
	int size;
	int front=-1;
	int rear=-1;
	int []queue;
	public Queue(int size) {
		this.size=size;
		queue = new int[size];
	}
	public void display() {
		if(rear==-1) {
			System.err.println("queue is empty");
			return;
		}
		else
		{
			for(int i=front;i<=rear;i++)
				System.out.println(queue[i]);
		}
	}
	public void enqueue(int data)
	{
		if(rear == (size -1))
			{System.err.println("Queue is full");
			return;
			}
		else if(front ==-1 && rear ==-1)
		{
			queue[++rear]=data;
			front=0;
		}
		else
			queue[++rear]=data;
	}
	public void dequeue()
	{
		if(isEmpty()== true)
		{
			System.err.println("Queue is empty");
			front =-1;
			rear=-1;
			return ;
		}
		else
		{
			System.out.println("dequeued element :"+queue[front++]);
		return;
		}
	}
	public boolean isEmpty() {
		if(rear<front || (rear==-1 && front ==-1))
			return true;
		else return false;
	}
	public void peak()
	{if(isEmpty()==true)
		System.err.println("Stack is empty no element to show");
	else
		System.out.println(queue[front]);
	}
}
