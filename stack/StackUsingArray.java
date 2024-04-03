package stack;

//stack - 1. inbuilt class, 2. we can build using array, 3. we can build using linked list


public class StackUsingArray {
	private int capacity;
	private int[] arr;
	private int top;
	private int size;

	
	public StackUsingArray() {
		System.out.println("Stack using Array");
		this.capacity = 100;
		this.arr = new int[capacity];
		this.top = -1;
	}
	
	public void push(int item) {
		if(isFull()) {
			throw new RuntimeException("Stack is full.");
		}
		arr[++top] = item;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty.");
		}
		return arr[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty.");
		}
		return arr[top];
	}
	
	public boolean isFull() {
		return top == capacity - 1;
	}
	
	public boolean isEmpty() {
		return top == - 1;
	}
	
	public void printStack() {
		for(int i=0; i<top; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void resize(int arr) {
		int new_size = 12;
		for(int i=0; i<new_size; i++) {
			//new_arr[i] = arr[i];
		}
	}
	

	public static void main(String[] args) {
		StackUsingArray obj = new StackUsingArray();
		
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		
		obj.printStack();
		
		System.out.println();
		
		System.out.println("First element: " + obj.peek());
		
		System.out.println("Is Empty: " + obj.isEmpty());
		
		System.out.println("Is Full: " + obj.isFull());
		
		System.out.println("Pop : " + obj.pop());
		
		System.out.println("First element now: " + obj.peek());
	}

}
