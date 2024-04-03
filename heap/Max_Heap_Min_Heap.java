 package heap;

import java.util.Scanner;

public class Max_Heap_Min_Heap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if (isMaxHeap(arr, n)) {
            System.out.println("The given array forms a Max Heap.");
        } else if (isMinHeap(arr, n)) {
            System.out.println("The given array forms a Min Heap.");
        } else {
            System.out.println("The given array does not form a Max Heap or Min Heap.");
        }

        scanner.close();
    }

    private static boolean isMaxHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if ((left < n && arr[i] < arr[left]) || (right < n && arr[i] < arr[right])) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMinHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if ((left < n && arr[i] > arr[left]) || (right < n && arr[i] > arr[right])) {
                return false;
            }
        }
        return true;
    }
}