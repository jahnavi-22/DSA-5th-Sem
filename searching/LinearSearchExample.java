package searching;

import java.util.Scanner;

public class LinearSearchExample {

	public LinearSearchExample() {
		
	}
	
	public int[] getInput(int N) {
		System.out.println("Enter " + N + " values: ");
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = input.nextInt();
		}
		return arr;
	}
	
	
	public int doLinearSearch(int numbers[], int key) {
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]==key) {
				return i;
			}
		}
		return -1;
	}

	
	public static void main(String[] args) {
		
		LinearSearchExample obj = new LinearSearchExample();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = input.nextInt();
		
		int numbers[] = obj.getInput(N);
		
		System.out.print("Enter key: ");
		int key = input.nextInt();
		
		int position = obj.doLinearSearch(numbers, key);
		System.out.println("The key is found at index " + position);
		

	}

}
