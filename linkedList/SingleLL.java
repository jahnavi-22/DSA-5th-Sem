package linkedList;


public class SingleLL {

	
	class Node{
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	Node head;
	
	public SingleLL() {
		head = null;
	}

	public void insertFirst(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	
	public void insertLast(int data) {
		Node n = new Node(data);
		 if (head == null) {
		        head = n;
		    }
		 else {
			 Node pointer = head;
			 while(pointer.next!=null) {
				 pointer = pointer.next;
			 }
			 pointer.next = n;
		 }
	}
	
	public void insertAtPosition(int data, int position) {
		Node n = new Node(data);
		if(head==null) {
			head = n;
		}
		else {
			Node temp = null;
			Node pointer = head;
			for(int i=0; i<position-1; i++) {
				temp = pointer;
				pointer = pointer.next;
			}
			temp.next = n;
			n.next = pointer;
		}
	}
	
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty.");
			return;
		}
		head = head.next;
	}
	
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is empty.");
		}
		if(head.next == null) {
			head = null;
		}
		else {
			Node second_last = head;
			while(second_last.next.next!=head) {
				second_last = second_last.next;
			}
			second_last.next = null;
		}
	}
	
	public void deleteAtPosition(int position) {
		if(head==null) {
			System.out.println("List is empty.");
		}
		else {
			Node temp = null;
			Node pointer = head;
			for(int i=0; i<position-1; i++) {
				temp = pointer;
				pointer = pointer.next;
			}
			temp.next = pointer.next;
		}
	}
	
	
	public void reverseList() {
		Node prev = head;
		Node currentNode = head.next;
		while(currentNode!=null) {
			Node next = currentNode.next;
			currentNode.next = prev;
			
			prev = currentNode;
			currentNode = next;
		}
		head.next = null;
		head = prev;
	}
	
	
	public Node reverseRecursive(Node head) {
		//empty node || last node or only one node
	       if(head == null || head.next == null) {
	           return head;
	       }

	       Node newHead = reverseRecursive(head.next);
	       head.next.next = head;
	       head.next = null;
	       return newHead;
	}
	
		
	public void printList() {
		Node pointer = head;
		while(pointer!=null) {
			System.out.print(pointer.data + "->");
			pointer = pointer.next;
		}
		System.out.println("NULL");
	}
	
	public void getSize() {
		Node pointer = head;
		int size = 0;
		while(pointer!=null) {
			size++;
			pointer = pointer.next;
		}
		System.out.println(size);
	}
	
	public static void main(String[] args) {
		SingleLL obj = new SingleLL();
		
		obj.insertLast(9);
		obj.insertLast(10);
		obj.insertLast(11);
		obj.insertLast(13);
		obj.insertLast(14);
		obj.insertLast(15);
		
		obj.insertAtPosition(12, 4);
//		obj.deleteAtPosition(5);
		
		obj.printList();
		obj.getSize();
	}

}
