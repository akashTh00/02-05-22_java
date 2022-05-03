// java program to find the middle element in a linked list--

class LLMiddleElem{
	Node head;

	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}

	void printMiddle()
	{
		Node fast_ptr = head;
		Node slow_ptr = head;

		while(fast_ptr != null && fast_ptr.next != null)
		{
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}
		System.out.println("The Middle Element is [" + slow_ptr.data + "] \n");
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
			System.out.print( n.data + "->");
			n = n.next;
		}
		System.out.print("NULL");
	}

	public static void main(String[] args) {
		LLMiddleElem llist = new LLMiddleElem();

		for(int i=5 ; i > 0 ; i--){
			llist.push(i);
			llist.printList();
			llist.printMiddle();
		}
	}
}

//hint:
//Traverse linked list using two pointers. Move one pointer by one and the other pointers by two. 
// When the fast pointer reaches the end slow pointer will reach the middle of the linked list.