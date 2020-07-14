package multithreading;

public class LinkedList {
	
	Node head;
	
	private class Node
	{
		int data;
		Node next;

		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
		
		public Node insertAtEndOfList(Node newNode)
		{
			Node first=head;
			Node prev=head;
			if(head ==null)
			{
				head=new Node(1,null);
			}
			else
			{
				while(first !=null)
				{
					prev=first;
					first=first.next;
				}
				prev.next=newNode;
			}
			return newNode;
		}
		
		public Node deleteFromHeadOfList()
		{
			Node temp=head;
			head=head.next;
			return temp;
		}
				
		
	}

}
