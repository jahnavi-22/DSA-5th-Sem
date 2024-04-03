package stack;

import java.util.Stack;

import org.w3c.dom.ls.LSOutput;

public class SortAStack {
	
	private Stack<Integer> main_stack;
	
	
	public SortAStack() {
		this.main_stack = new Stack<>();
	}
	
	
	public void addValues() {
		main_stack.push(5);
		main_stack.push(2);
		main_stack.push(7);
		main_stack.push(3);
		main_stack.push(8);
		main_stack.push(1);
		main_stack.push(6);
	}
	
	public Stack<Integer> getStack(){
		return main_stack;
	}
	
	public void sortStack() {
		Stack<Integer> temp_stack = new Stack<>();
		
		while(!main_stack.isEmpty()) {
			int currentValue = main_stack.pop();
			
			if(!temp_stack.isEmpty() && temp_stack.peek() > currentValue) {
				main_stack.push(temp_stack.pop());						//to insert larger value in main_stack
			}
			 temp_stack.push(currentValue);						//to insert minimum value in temp_stack
		}
		
		// Loop condition here  --> transfer from temp_stack to main_stack
        while (!temp_stack.isEmpty()) {
            main_stack.push(temp_stack.pop());
        }

	}
	
	public void showValues() {
		while(!main_stack.empty()) {
			System.out.print(main_stack.pop() + " ");
		}
	}

	public static void main(String[] args) {
		SortAStack obj = new SortAStack();
		
		obj.addValues();
		obj.sortStack();
		obj.showValues();
		
	}

}
