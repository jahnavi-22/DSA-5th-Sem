package linkedList;

import linkedList.SingleLL.Node;

//import linkedList.SingleLL.Node;

/*
 * nodes = data + pointer
 * instance fields should never be initialized except 'final'
 * */

public class SingleLinkedList {
	
	//Node class
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	//object of Node class
	Node head;
	

	public SingleLinkedList() {
		head =  null;
	}
	
	
	public Node insert(int data) {
		
		//[ 10 |  ]
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		return head;
	}
	
	public Node insertAtEnd(int data) {
		Node newNode = new Node(data);
		
		Node currentNode = head;
		while(currentNode.next!=null) {
			currentNode = currentNode.next;
		}
		currentNode = newNode;
		return newNode;
	}
	
	
	
	public Node deleteFirst() {
		Node currentNode = head;
		if(currentNode!=null) {
			currentNode = currentNode.next;
			currentNode = head;
		}
		return head;
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
	
	public void show() {
		Node currentNode = head;
		while(currentNode!=null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}
	

	
	
	public static void main(String[] args) {
		SingleLinkedList obj = new SingleLinkedList();
		
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
//		obj.insertAtPosition(40,1);
		
		obj.show();
		obj.getSize();
	}

}
