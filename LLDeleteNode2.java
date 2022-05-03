// java program to delete a node at given position in Linked List in java--

class LLDeleteNode2{
	Node head;

	class Node
	{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}

	void DeleteNode(int position)
	{
		if(head == null){
			return;
		}

		Node temp = head;

		if( position == 0 )
		{
			head = temp.next;
			return;
		}
		for(int i = 0 ; i < position-1 ; i++)
		{
			temp = temp.next;
		}
		if(temp == null || temp.next == null)
			return;

		Node next = temp.next.next;
		temp.next = next;
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
		LLDeleteNode2 llist = new LLDeleteNode2();

		llist.push(7);
		llist.push(1);
		llist.push(3);
		llist.push(2);
		llist.push(8);

		System.out.println("\nCreated Linked List is : ");
		llist.printList();
		llist.DeleteNode(4);
		System.out.println("\nLinked List after Deletion at position 4 : ");
		llist.printList();
	}
}