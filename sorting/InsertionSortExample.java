package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortExample {

	public InsertionSortExample() {
		// TODO Auto-generated constructor stub
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
	
	
	public void doInsertionSort(int N, int arr[]) {
		int temp;
		if(N==1) {
			return;
		}
		
		//LOGIC BUILDING CODE
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				if(arr[j]<arr[i]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
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
		InsertionSortExample obj = new InsertionSortExample();
		
		int a[] = obj.getInput(N);
		obj.doInsertionSort(N, a);
		obj.getResult(a);

	}

}
