package searching;

import java.util.Scanner;

public class BinarySearchExample {

	public BinarySearchExample() {
		// TODO Auto-generated constructor stub
	}
	
	public int[] getInput(int N) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter " + N + " values : ");
		
		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = input.nextInt();
		}
		return arr;
	}
	
	public int doBinarySearch(int numbers[], int key) {
		int low = 0;
		int high = numbers.length - 1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(numbers[mid]==key) {
				return mid;
			}
			if(numbers[mid]<key) {
				low = mid + 1;			
			}else if(numbers[mid]>key) {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearchExample obj = new BinarySearchExample();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = input.nextInt();
		
		int[] numbers = obj.getInput(N);

		System.out.print("Enter key : ");
		int key = input.nextInt();
		
		int position = obj.doBinarySearch(numbers, key);
		System.out.println("The key is found through Binary Search at index : " + position);
	}

}
