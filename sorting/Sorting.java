package sorting;

import java.util.Scanner;

public class Sorting {

	public Sorting() {
		// TODO Auto-generated constructor stub
	}
	
	public int[] getInput(int N) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter " + N + " integers :");
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = input.nextInt();
		}
		return arr;
	}
	
				//takes the largest element and push it to the end by swapping it one by one with each element
	public void doBubbleSort(int N, int arr[]) {
		if(N==1) {
			return;
		}
		
		int temp;
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
				//finds the smallest element by comparison through loop and swaps it with the first element then second and so on
	public void doSelectionSort(int N, int arr[]) {
		if(N==1) {
			return;
		}
		
		for(int i=0; i<N; i++) {
			int min = i;
			for(int j=i+1; j<N; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	
	public void doInsertionSort(int N, int[] arr) {
		if(N==1) {
			return;
		}
		
		for(int i=1; i<N; i++) {
			int current = arr[i];
			int j = i-1;
			while(j>=0 && current<arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
	}

	
	public void doMergeSort(int[] numbers) {
		int inputLength = numbers.length;
		
		int midIndex = inputLength/2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];
		
		for(int i = 0; i<midIndex; i++) {
			leftHalf[i] = numbers[i];
		}
		for(int i = midIndex; i<inputLength; i++) {
			rightHalf[i-midIndex] = numbers[i];
		}
		
		if(inputLength<=1) {
			return;
		}
		
		doMergeSort(leftHalf);
		doMergeSort(rightHalf);
		merge(numbers, leftHalf, rightHalf);
	}
	
	public void merge(int numbers[], int leftHalf[], int rightHalf[]) {			//divide and conquer
		int leftLength = leftHalf.length;
		int rightLength = rightHalf.length;
		int i=0, j=0, k=0;
		
		while(i < leftLength && j < rightLength) {
			if(leftHalf[i]<rightHalf[j]) {
				numbers[k] = leftHalf[i];
				i++;
			}else {
				numbers[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		
		while(i<leftLength) {
			numbers[k] = leftHalf[i];
			i++;
			k++;
		}
		
		while(j<rightLength) {
			numbers[k] = rightHalf[j];
			j++;
			k++;
		}
	}
	
	
	public void doQuickSort(int[] numbers, int low, int high) {
		
		if(low<high) {
			int pivot = partition(numbers, low, high);
			
			doQuickSort(numbers, low, pivot-1);
			doQuickSort(numbers, pivot+1, high);
		}
	}
	
	public int partition(int numbers[], int low, int high) {
		
		int pivot = numbers[high];
		int i = low-1;
		
		for(int j=0; j<high; j++) {
			if(numbers[j]<pivot) {
				i++;
				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
			}
		}
		int temp = numbers[i+1];
		numbers[i+1] = numbers[high];
		numbers[high] = temp;
		
		return (i+1);
	}
	

	public void getResult(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		Sorting obj = new Sorting();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = input.nextInt();
		
		int numbers[] = obj.getInput(N);
		obj.doBubbleSort(N, numbers);
		obj.doSelectionSort(N, numbers);
		obj.doInsertionSort(N, numbers);
		obj.doMergeSort(numbers);
//		obj.doQuickSort(numbers);
		
		obj.getResult(numbers);
	}

}
