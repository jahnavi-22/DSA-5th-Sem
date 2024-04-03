package sorting;

import java.util.Scanner;

/*pivot = middle, partitioning, recursive call to merge sort()*/


 public class MergeSortExample {

    public void doMergeSort(int[] numbers) {
        int inputLength = numbers.length;

        int midIndex = inputLength / 2;

        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = numbers[i];
        }

        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = numbers[i];
        }
        
        if (inputLength <= 1) {
            return;
        }

        doMergeSort(leftHalf);
        doMergeSort(rightHalf);
        merge(numbers, leftHalf, rightHalf);
    }

    public void merge(int[] numbers, int[] leftHalf, int[] rightHalf) {
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;
        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (leftHalf[i] <= rightHalf[j]) {
                numbers[k] = leftHalf[i];
                i++;
            } else {
                numbers[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftLength) {
            numbers[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightLength) {
            numbers[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void printValues(int[] numbers) {
        for (int k : numbers) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {6, 3, 9, 5, 2, 8};
        MergeSortExample obj = new MergeSortExample();

        System.out.println("Original Array:");
        printValues(numbers);

        obj.doMergeSort(numbers);

        System.out.println("Sorted Array:");
        printValues(numbers);
    }
}

 
 

/*
 * SIR'S CODE

public class MergeSortExample{
	
	public int[] getInput(int N) {
		int[] arr = new int[N];
	    Scanner input = new Scanner(System.in);

	    System.out.println("Enter " + N + " integers:");
	    for (int i = 0; i < N; i++) {
	        arr[i] = input.nextInt();
	    }
	    return arr;
	}
	
	
	public void doMergeSort(int[] numbers) {
		int length = numbers.length;
		if(length<=1) {
			return;
		}
		
		int midIndex = length/2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[length-midIndex];
		
		for(int i=0; i<midIndex; i++) {
			leftHalf[i] = numbers[i];
		}
		
		for(int i=midIndex; i<length; i++) {
			rightHalf[i-midIndex] = numbers[i];
		}
		
		doMergeSort(leftHalf);
		doMergeSort(rightHalf);
		merge(numbers, leftHalf, rightHalf);
	}
	
	
	public void merge(int[] numbers, int[] leftHalf, int[] rightHalf) {
		int leftLength = leftHalf.length;
		int rightLength = rightHalf.length;
		int i=0, j=0, k=0;
		
		while(i<leftLength && j<rightLength) {
			if(leftHalf[i] <= rightHalf[j]) {
				numbers[k] = leftHalf[i];
				i++;
			}else {
				numbers[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		
		while(i < leftLength ) {
			numbers[k] = leftHalf[i];
			k++;
			i++;
		}
		
		while(j < rightLength ) {
			numbers[k] = rightHalf[j];
			k++;
			j++;
		}
		
	}
	
	
	public void getResult(int numbers[]) {
		int N = numbers.length;
		for(int i=0; i<N; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

	public static void main(String[] args) {
		int N;
		Scanner input = new Scanner(System.in);
		System.out.print("N: ");
		N = input.nextInt();
		
		MergeSortExample obj = new MergeSortExample();
		
		int numbers[] = obj.getInput(N);
		obj.doMergeSort(numbers);
		obj.getResult(numbers);
	}
}


*/

