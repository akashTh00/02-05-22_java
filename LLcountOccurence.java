// java program to count occurence in a linked list--

class LLcountOccurence{
	Node head;

	class Node{
		int data;
		Node next;

		Node(int d){
			data = d;
			next = null;
		}
	}

	int count(int search_for)
	{
		Node current = head;
		int count = 0;
		while (current != null)
		{
			if(current.data == search_for)
				count++;
			current = current.next;
		}
		return count;
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
		LLcountOccurence llist = new LLcountOccurence();
        /* Use push() to construct below list
          1->2->1->3->1  */
        llist.push(1);
        llist.push(2);
        llist.push(1);
        llist.push(3);
        llist.push(1);

		System.out.println("Count of 1 is " + llist.count(1));
	}
}