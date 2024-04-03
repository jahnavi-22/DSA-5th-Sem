package advancedArrayProblems;

import java.util.Scanner;

public class KadanesAlgo {
	private int global_maximum;
	private int local_maximum;
	private int N;
	private int[] a;

	public KadanesAlgo() {
		// TODO Auto-generated constructor stub
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
	
	public int getMaximumSumOfSubarray() {
		for (int i=0; i<N; i++) {
			local_maximum = Math.max(a[i], a[i] + local_maximum);
			System.out.println(local_maximum + " ");
			/*
			 2 -4 3 -1 2
			 x = max(2,(2+0)) = 2
			 x = max(-4,(-4+2)) = -2
			 x = max(3,(3+(-2)) = 3
			 x = max(2,(2+0)) = 2
			 x = max(2,(2+0)) = 2
			 * */
		}
		if(global_maximum<local_maximum)
			global_maximum = local_maximum;
		
		return global_maximum;
	}

	public static void main(String[] args) {
		
		KadanesAlgo obj = new KadanesAlgo();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = input.nextInt();
		
		int numbers[] = obj.getInput(N);
		
		obj.getMaximumSumOfSubarray();

	}

}
