package circular_linked_list;



public class CircularLinkedList {
	
		Node head,tail;
		static int count;
		public void insert(int data) {
			Node node = new Node(data);
			
			if(head == null) {
				head = node;
				tail= node;
				node.next=head;
				count++;
			}
			else {
				tail.next=node;
				tail=node;
				tail.next=head;
				count++;
			}
		}
		public void display()
		{
			if(head == null) {
				System.err.println("no data to display");
			}
			Node temp = head;
			do{  
                System.err.print(" "+ temp.data);  
                temp = temp.next;  
            }while(temp != head);  
            System.out.println();  
		}
		public void updateData(int index,int data) {
			
			if(index>count)
				System.out.println("Index out of Bound");
			Node temp=head;
			for(int i=1;i<index;i++) {
				temp=temp.next;
			}
			if(temp!= head)
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
		            tail.next=head;
		            count++;
		            return;
		        } else {
		            // Traverse the list to find the right spot
		            Node temp1 = head;
		            int i = 1;
		            // We need to stop when i == index-1 (because temp1 is the node before the insertion point)
		            while (i < index - 1 && temp1.next != head) {
		                temp1 = temp1.next;
		                i++;
		            }
		            
		            // If temp1 is null, the index is out of bounds.
		            if (temp1.next == head && i < index - 1) {
		                System.err.println("Index out of bounds.");
		                return;
		            } else {
		                Node node = new Node(data);
		                node.next = temp1.next; // Connect the new node to the next node in the list.
		                temp1.next = node; // Connect temp1 to the new node.
		                if (node.next == head) {
		                    tail = node; // Update tail to point to the new last node.
		                }

		                count++;
		                
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
		        // If there's only one node in the list
		        if (head == head.next) {
		            head = null; // The list becomes empty after removal
		            tail = null; // Update tail as well
		        } else {
		            head = head.next;
		            tail.next = head; // Ensure the tail still points to the head (circular list)
		        }
		        count--;
		        return;
		    }

		    // Traverse to the (index - 1)th node
		    Node current = head;
		    for (int i = 1; i < index - 1 && current.next != head; i++) {
		        current = current.next;
		    }

		    // If current.next is head, it means we reached the end without finding the specified index
		    if (current.next == head) {
		        System.err.println("Index out of bounds.");
		        return;
		    }

		    // If the node to delete is the last node (tail node)
		    if (current.next == tail) {
		        tail = current; // Move the tail pointer to the second-last node
		    }

		    // Delete the node at the specified index
		    current.next = current.next.next; // Skip over the node to be deleted
		    count--;
		}



}

