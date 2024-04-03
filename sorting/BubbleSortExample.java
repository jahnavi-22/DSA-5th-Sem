package sorting;

import java.util.Scanner;

public class BubbleSortExample {

	public BubbleSortExample() {
		
	}
	
	public int[] getInput(int N) {
		int[] arr = new int[N];
	    Scanner input = new Scanner(System.in);

	    System.out.println("Enter " + N + " integers:");
	    for (int i = 0; i < N; i++) {
	        arr[i] = input.nextInt();
	    }
	    
	    return arr;
	}
	
	//LOGIC BUILDING CODE
	public void doBubbleSort(int N, int arr[]) {
		int temp;
		if(N==1) {
			return;
		}
		//for N>1
		for(int i=0; i<N; i++) {
			for(int j=0; j<N-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	
	public void getResult(int arr[]) {
		int N = arr.length;
		for(int i=0; i<N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	

	public static void main(String[] args) {
		int N=0;
		Scanner input = new Scanner(System.in);
		System.out.print("N: ");
		N = input.nextInt();
		BubbleSortExample obj = new BubbleSortExample();
		
		int a[] = obj.getInput(N);
		obj.doBubbleSort(N, a);
		obj.getResult(a);
	}

}
