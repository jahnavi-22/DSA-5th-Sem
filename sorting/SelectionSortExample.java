package sorting;

import java.util.Scanner;

public class SelectionSortExample {

	public SelectionSortExample() {
		
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
	public void doSelectionSort(int N, int arr[]) {
		int min;
		int temp;
		
		if(N==1) {
			return;
		}
		
		//for N=1
		for(int i=0; i<N; i++) {
			min = i;
			for(int j=i+1; j<N; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	
	
	public void getResult(int arr[]) {
		int N = arr.length;
		for(int i=0; i<N; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		int N=0;
		Scanner input = new Scanner(System.in);
		System.out.println("N: ");
		N = input.nextInt();
		SelectionSortExample obj = new SelectionSortExample();
		
		int a[] = obj.getInput(N);
		obj.doSelectionSort(N, a);
		obj.getResult(a);

	}

}
