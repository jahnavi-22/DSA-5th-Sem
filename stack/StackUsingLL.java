package stack;

import java.util.LinkedList;

public class StackUsingLL {

	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	Node head;
	
	public boolean isEmptyy() {
		return head == null;
	}
	
	public void pushElement(int value) {
		Node n = new Node(value);
		if(isEmptyy()) {
			head = n;
		}
		n.next = head;
		head = n;
	}
	
	public int popElement() {
		if(isEmptyy()) {
			return -1;
		}
		int top = head.data;
		Node n = head;
		head = head.next;
		return top;
	}
	
	public int peek() {
		if(isEmptyy()) {
			return -1;
		}
		return head.data;
	}

	public static void main(String[] args) {
		LinkedList<Integer> obj = new LinkedList<>();

	}

}
