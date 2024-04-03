package queue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueUsingLL {

	public QueueUsingLL() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Queue<String> obj = new LinkedList<>();
		
		//adding items to the queue
		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("D");
		
		System.out.println("Waiting Queue : " + obj);
		
		//check if queue is empty				
		System.out.println("Is the queue empty? : " + obj.isEmpty());
		
		//find the size of the queue
		System.out.println("Size of waiting queue : " + obj.size());
		
		//first element
		//obj.element() - throws RuntimeException when empty
		//obj.peek() - shows null when empty
		System.out.println("First person in the waiting queue : " + obj.element());	
		System.out.println("First person in the waiting queue : " + obj.peek());	
		
		
	}

}
