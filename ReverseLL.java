//java program to reverse a linked list--

class ReverseLL{
	static Node head;

	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	static Node Reverse(Node node)
	{
		Node prev = null;
		Node curr = node;
		Node next = null;
		while(curr != null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		node = prev;
		return node;
	}

	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	public void printList()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	public static void main(String[] args) {
		ReverseLL llist = new ReverseLL();

		llist.push(85);
		llist.push(15);
		llist.push(12);
		llist.push(20);
		llist.push(87);
		llist.push(99);
		llist.push(100);

		System.out.println("Given Linked List is : ");
		llist.printList();
		System.out.println();	
		head = Reverse(head);
		System.out.println("Reversed Linked List is : ");
		llist.printList();

	}
}