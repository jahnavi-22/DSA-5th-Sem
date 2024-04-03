package stack;

import java.util.Iterator;
import java.util.Stack;

public class Cards {

	public Cards() {
		// TODO Auto-generated constructor stub
	}

	/*public static void main(String[] args) {
		Stack<String> obj = new Stack<>();
		
		//pushing items in to the stack
		obj.push("Jack");
		obj.push("King");
		obj.push("Queen");
		obj.push("Ace");
		
		System.out.println("Stack : " + obj);
		
		//check if stack is empty												//EmptyStackException
		System.out.println("Is the stack of cards empty? : " + obj.isEmpty());
		
		//find the size of the stack
		System.out.println("Size of stack : " + obj.size());
		
		//get the item at the top without removing it
		System.out.println("Peek : " + obj.peek());		//card at the top
		System.out.println("Current stack : " + obj);
		
		//searching
		System.out.println("Found Ace at : " + obj.search("Ace"));
		
		//iterator
		Iterator<String> cardsIterator = obj.iterator();
		while(cardsIterator.hasNext()) {
			String card = cardsIterator.next();
			System.out.println(card);
		}
	}*/
	
	public static void main(String[] args) {
		Stack<Integer> obj = new Stack<>();
		
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		
		System.out.println("Stack : " + obj);
		System.out.println("Is stack empty? " + obj.isEmpty());
		System.out.println("Size of stack : " + obj.size());
		System.out.println("Element at the top of the stack : " + obj.peek());
		System.out.println("Found '30' at position : " + obj.search(30));
	}
}
