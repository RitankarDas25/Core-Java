package singly_linked_list;

public class SinglyLinkedList {
Node head,tail;
static int count;
public void insert(int data) {
	Node node = new Node(data);
	
	if(head == null) {
		head = node;
		tail= node;
		count++;
	}
	else {
		tail.next=node;
		tail=node;
		count++;
	}
}
public void display()
{
	if(head == null) {
		System.err.println("no data to display");
	}
	Node temp = head;
	while(temp != null)
		{System.err.print(temp.data+" ");
			
			temp=temp.next;
		}
	System.out.println();
}
public void updateData(int index,int data) {
	
	if(index>count)
		System.out.println("Index out of Bound");
	Node temp=head;
	for(int i=1;i<index;i++) {
		temp=temp.next;
	}
	if(temp!= null)
	temp.data=data;
}
public void insertPosition(int index, int data) {
    if (index < 1) {
        System.err.println("Invalid index");
        return; // Invalid index case
    }

    if (head == null) {
        if (index == 1) {
            insert(data); // If the list is empty and index is 1, we just add the node.
        } else {
            System.err.println("List is empty, index out of range.");
        }
    } else {
        // If the index is 1, insert at the head of the list.
        if (index == 1) {
            Node node = new Node(data);
            node.next = head;
            
            head = node;
            
        } else {
            // Traverse the list to find the right spot
            Node temp1 = head;
            int i = 1;
            // We need to stop when i == index-1 (because temp1 is the node before the insertion point)
            while (i < index - 1 && temp1 != null) {
                temp1 = temp1.next;
                i++;
            }
            
            // If temp1 is null, the index is out of bounds.
            if (temp1 == null) {
                System.err.println("Index out of bounds.");
            } else {
                Node node = new Node(data);
                node.next = temp1.next; // Connect the new node to the next node in the list.
                temp1.next = node; // Connect temp1 to the new node.
            }
        }
    }
}
public void deletePosition(int index) {
    // Invalid index or empty list case
    if (index < 1 || head == null) {
        System.err.println("Invalid index or list is empty.");
        return;
    }

    // Special case: delete at the head
    if (index == 1) {
        head = head.next;
        count--;
        return;
    }

    // Traverse to the (index - 1)th node
    Node current = head;
    for (int i = 1; i < index - 1 && current != null; i++) {
        current = current.next;
    }

    // If the current node is null, index is out of bounds
    if (current == null || current.next == null) {
        System.err.println("Index out of bounds.");
        return;
    }

    // Delete the node at the specified index
    current.next = current.next.next;
    count--;
}

}



