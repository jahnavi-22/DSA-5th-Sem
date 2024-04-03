package sorting;

import java.util.Scanner;
import java.util.Stack;

/*public class RevertWithContainer {
	
	private static Scanner input;
	
	private int N;
	private int[] arr;
	private Stack<Integer> stack;
	
	static {
		input = new Scanner(System.in);
	}
	
	{
		stack = new Stack<>();
	}

	public RevertWithContainer(int N) {
		N = input.nextInt();
		this.N = N;
	}
	
	public int getN() {
		return N;
	}
	
	public void createArray(int size) {
		arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = input.nextInt();
		}
	}
	
	
	public int[] getArray() {
		return arr;
	}
	
	
	public void doSort(int[] data) {
		int temp;
		if(N==1) {
			return;
		}
		
		//LOGIC BUILDING CODE
		for(int i=0; i<N; i++) {
			for(int j=1; j>0; j--) {
				if(data[j]>data[j-1]) {
					temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;
				}
			}
		}
		arr = data;
	}
	
	public void passingToContainer(int[] data) {
		//push
		for(int i=0; i<data.length; i++) {
			stack.push(data[i]);
		}
		
		//pop
		for(int i=0; !stack.isEmpty(); i++) {
			arr[i] = stack.pop();
		}
	}
	
	public void showOutput() {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	

	public static void main(String[] args) {
		int N=0;
		
		RevertWithContainer obj = new RevertWithContainer(N);
		obj.createArray(obj.getN());
		
	}

}*/




/*import java.util.Scanner;
import java.util.Stack;

public class RevertWithContainer {

    public void revertWithContainer(int[] arr) {
        Stack<Integer> s = new Stack<>();

        for (int k : arr) {
            s.push(k);
        }
        int n = s.size();


        System.out.println("Reversed array:");


        int[] result = new int[n];

        for(int i = 0;i<n;i++){
            result[i] = s.pop();
        }

        for(int k : result){
            System.out.print(k + " ");
        }

    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        InsertionSort obj = new InsertionSort(arr,n);
        obj.doInsertionSort();
        
        System.out.println("Sorted array:");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();

        RevertWithContainer obj2 = new RevertWithContainer();
        obj2.revertWithContainer(arr);
    }
}
*/