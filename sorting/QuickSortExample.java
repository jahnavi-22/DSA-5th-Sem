package sorting;

/*pivot, partitioning, recursive call to quick sort()*/
/*
public class QuickSortExample {

	public QuickSortExample() {
		
	}
	
	public void quickSort(int[] numbers, int lowIndex, int highIndex) {
		if(lowIndex>=highIndex) {
			return;
		}
		
		//4 2 6 7 8 3
		int pivot = numbers[highIndex];
		
		
		//LP: 4		2 6 7 8		RP: 3
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
	}

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("N: ");
		n = input.nextInt();
		
		QuickSortExample obj = new QuickSortExample();
		
		//int[] numbers = obj.generateRandomNumbers();
	}

}
*/


import java.util.Random;
import java.util.Scanner;

public class QuickSortExample {

    private int n;

    public QuickSortExample(int n) {
        this.n = n;
    }

    public void doQuickSort(int[] numbers, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int pivot = numbers[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (numbers[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (numbers[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(numbers, leftPointer, rightPointer);
        }

        swap(numbers, leftPointer, highIndex);

        doQuickSort(numbers, lowIndex, leftPointer - 1);
        doQuickSort(numbers, leftPointer + 1, highIndex);
    }
    
    public void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void printValues(int[] numbers) {
        for (int k : numbers) {
            System.out.print(k + " ");
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = input.nextInt();

        QuickSortExample obj = new QuickSortExample(n);

        int[] numbers = new int[n];
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            numbers[i] = r.nextInt(50);
        }

        System.out.println("Original Array:");
        printValues(numbers);

        obj.doQuickSort(numbers, 0, n - 1);

        System.out.println("Sorted Array:");
        printValues(numbers);
    }

    
}
