package stack;

import java.util.Stack;

/*


public class TwoStacksInArray {
	
	private Stack<Integer> first_stack;
	private Stack<Integer> second_stack;
	private int[] array;
	
	public int size(Stack<Integer> stack) {
		return stack.size();
	}

	public TwoStacksInArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

*/



public class TwoStacksInArray {

    private int[] arr;
    private int top1;
    private int top2;

    public TwoStacksInArray(int capacity){
        this.arr = new int[capacity];
        top1 = -1;
        top2 = capacity;
    }

    // push into stack 1
    public boolean push1(int value){
        if(top1 + 1 < top2){
            arr[++top1] = value;
            return true;
        }
        else{
            return false;
        }
    }

    // push into stack 2
    public boolean push2(int value){
        if(top2 - 1 > top1){
            arr[--top2] = value;
            return true;
        }
        else{
            return false;
        }
    }

    public int pop1(){
        if(isEmpty1()){
        	throw new IllegalArgumentException("Stack 1 is empty");
        }
        else{
        	return arr[top1--];
        }
    }

    public int pop2(){
        if(isEmpty2()){
        	throw new IllegalArgumentException("Stack 2 is empty");
        }
        else{
        	return arr[top2--];
        }
    }
    

    public boolean isEmpty1(){
        return top1 == -1;
    }

    public boolean isEmpty2(){
        return top2 == arr.length;
    }

    public void getArr() {
        for(int k : arr){
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int capacity = 8;
        TwoStacksInArray obj = new TwoStacksInArray(capacity);
        obj.push1(10);
        obj.push1(20);
        obj.push1(30);
        obj.push1(40);
        obj.push1(50);
        obj.push2(1);
        obj.push2(2);
        obj.push2(3);

        obj.getArr();

        System.out.println(obj.pop1());
        System.out.println(obj.pop1());

        System.out.println(obj.pop2());
    }
}