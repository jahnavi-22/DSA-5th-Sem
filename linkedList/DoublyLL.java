package linkedList;


public class DoublyLL {
	
	//node class
	class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data)
		{
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}

	Node head;
	Node tail;
	
	
	public DoublyLL() {
		head = null;
		tail = null;
	}


	
	public void insert(int value) {
		Node n = new Node(value);
		if(head==null) {
			head= n;
			tail= n;
			n.next= null;
			n.prev= null;
		 }
		 else{
			 tail.next= n;
			 n.prev= tail;
			 tail=n;
			 tail.next= null;
			 
		 }
	}
	
	public void insertAtPosition(int value, int position) {
		Node n = new Node(value);
		if(head==null) {
			head = n;
			tail = n;
			n.next = null;
			n.prev = null; 
		}
		else {
			Node temp = null;
			Node currentNode = head;
			for(int i=0; i<position; i++) {
				temp = currentNode;
				currentNode = currentNode.next;
			}
			temp.next = n;
			n.prev = temp;
			n.next = currentNode;
			currentNode.prev = n;
		}
	}
	
	
	public void deleteFirst() {
		if (head == null) {
            System.out.println("List is empty.");
            return;
        }
		Node currentNode = head;
		if(currentNode!=null) {
			currentNode = currentNode.next;
			currentNode = head;
		}
	}
	
	public void deleteEnd() {
		if(head == null) {
			System.out.println("List is empty.");
            return;
		}
		else {
			Node currentNode = head;
			while(currentNode.next!=null) {
				currentNode = currentNode.next;
			}
			Node prevNode = currentNode.prev;
			prevNode.next = null;
		}
	}
	
	
	public void deleteAtPosition(int position) {
		if(head==null) {
			System.out.println("List is empty.");
		}
		else {
			Node temp = null;
			Node currentNode = head;
			for(int i=0; i<position; i++) {
				temp = currentNode;
				currentNode = currentNode.next;
			}
			temp.next = currentNode.next;
			currentNode.prev = temp;
		}
	}
	
	public int search(int value) {
		if(head==null) {
			System.out.println("List is empty.");
			return -1;
		}
		else {
			Node currentNode = head;
			int position = 1;
			while(currentNode!=null) {
				if(currentNode.data == value) {
					return position;
				}
				currentNode = currentNode.next;
				position++;
			}
			return position;
		}
	}
	
	// Traversing from head to the end of the list
	public void traverseForward(){
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
			}
		}
		
		
	// Traversing from tail to the head
	public void traverseBackward(){
		Node currentNode = tail;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.prev;
			}
		}
	
	public static void main(String[] args) {
		
		DoublyLL obj = new DoublyLL();
		

	}

}
