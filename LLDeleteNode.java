//java program to delete a node in singly LInked List--

class LLDeleteNode{
	Node head;

	class Node{
		int data;
		Node next;

		Node(int d){
			data = d;
			next = null;
		}
	}
	void deleteNode(int key)
	{
		Node temp = head, prev = null;
		if(temp != null && temp.data == key)
		{
			head = temp.next;
			return;
		}
		while(temp != null && temp.data != key)
		{
			prev = temp;
			temp = temp.next;
		}
		if(temp == null)
			return;
		prev.next = temp.next;
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
		LLDeleteNode llist = new LLDeleteNode();
		llist.push(7);
		llist.push(1);
		llist.push(3);
		llist.push(2);

		System.out.println("\n Created Linked List is : ");
		llist.printList();
		llist.deleteNode(1);
		System.out.println("\n Linked list after Deletion is : ");
		llist.printList();
	}
}