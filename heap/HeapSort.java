package heap;

public class HeapSort {

	public HeapSort() {
		// TODO Auto-generated constructor stub
	}
	
	public void sort(int array[]) {
		int size = array.length;
		
		for(int i = size/2 - 1; i>=0; i--) {
			heapify(array, size, i);
		}
		
		for(int i=size-1; i>0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			
			heapify(array, i, 0);
		}
		
	}
	
	public static void heapify(int[] array, int size, int root) {
		
		int largest = root;
		int leftchild = 2*root + 1;
		int rightChild = 2*root + 2;
		
		//if the left child is larger than the root
		if(leftchild < size && array[leftchild] > array[largest]) {
			largest = leftchild;
		}
		
		//if the right child is larger than the root
		if(rightChild < size && array[rightChild] > array[largest]) {
			largest = rightChild;
		}
		
		//if largest is not root
		if(largest!=root) {
			int swap = array[root];
			array[root] = array[largest];
			array[largest] = swap;
		}
		
		heapify(array, size, largest);
	}

	public static void main(String[] args) {
		
		int array[] = new int[5];
		int size = array.length;
		
		HeapSort obj = new HeapSort();
		obj.sort(array);
	}

}
