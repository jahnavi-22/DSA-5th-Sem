package queue;

//can't find size using rear

public class QueueUsingArray {
	
	private int capacity;
	private int[] arr;
	private int front;
	private int rear;
	private int size;

	public QueueUsingArray() {
		System.out.println("Queue using Array");
		this.capacity = 100;
		this.arr = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	
	public void enqueue(int item) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		rear++;
		arr[rear] = item;
		size++;
	}
	
	public int dequeue() {
		if(isFull()) {
			System.out.println("Queue is full");
			return -1;
		}
		int item = arr[front];
        front++;
        size--;
        return item;
	}
	
	public int front() {
		if(isEmpty()) {
			System.out.println("Queue is empty.");
			return -1;
		}
		return arr[front];
	}
	
	public int rear() {
		if(isEmpty()) {
			System.out.println("Queue is empty.");
			return -1;
		}
		return arr[rear];
	}
	
	
	public boolean isFull() {
		return size == capacity;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void printQueue() {
		for(int i=0; i<arr[front]; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		QueueUsingArray obj = new QueueUsingArray();
        obj.enqueue(10);
        obj.enqueue(15);
        obj.enqueue(20);
        obj.enqueue(25);
        obj.enqueue(30);

        System.out.println("Queue: ");
        obj.printQueue();
        System.out.println("Front: " + obj.front());
        System.out.println("Dequeue: " + obj.dequeue());
        System.out.println("Front: " + obj.front());
        System.out.println("Is Empty: " + obj.isEmpty());
        System.out.println("Is Full: " + obj.isFull());

	}

}
