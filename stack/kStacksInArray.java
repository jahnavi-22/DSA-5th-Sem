package stack;

import java.util.Scanner;

import javax.swing.text.TabStop;

public class kStacksInArray {
	
	private int k;
	private int[] arr;
	private int capacity;
	
	private int[] top;
	private int[] next;
	private int free_slot;

	
	
	public kStacksInArray(int k, int capacity) {
		this.k = k;
		this.capacity = capacity;
		
		arr = new int[capacity];
		top = new int[k];
		next = new int[capacity];
		
		//initialize the top index of each stack to -1
		for(int i=0; i<k; i++) {
			top[i] = -1;
		} 
		
		//initialize the next index of each element in the stack
		for(int i=0; i<capacity-1; i++) {
			next[i] = i+1;
		}
		next[capacity-1] = -1;			//indicates end of array
		
		//initialize free slot to the beginning of the array
		free_slot=0;
	}
	
	public void push(int stackNumber, int value){
		if(free_slot == -1) {
			throw new StackOverflowError("Stack Overflow");
		}
		
		//get the index of the next free slot
		int index = free_slot;
		
		//update the free slot to the next available slot
		free_slot = next[index];
		
		//set the current top index of the stack to the next index of the pushed element
		next[index] = top[stackNumber];
		
		//set the top index of the stack to the pushed element
		top[stackNumber] = index;
		
		//update the free slot to the value
		arr[index] = value;
	}
	

	public int pop(int stackNumber) {
		if(top[stackNumber] == -1) {
			throw new StackOverflowError("Stack Overflow");
		}
		
		//get the index of the top element of the stack
		int index = top[stackNumber];
		
		//get the value of the top element
		int value = arr[index];
		
		//update the top index of the stack to the next index of the popped element
		top[stackNumber] = next[index];
		
		//update the next index of the popped element to the free slot
		next[index] = free_slot;
		
		//update the free slot to the popped element
		free_slot = index;
		
		//return the popped element
		return value;
	}
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter k: ");;
		int k = input.nextInt();
		
		System.out.println("Enter capacity: ");;
		int capacity = input.nextInt();
		
		kStacksInArray obj = new kStacksInArray(k, capacity);
	}

}
