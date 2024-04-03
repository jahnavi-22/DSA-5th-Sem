package factorisation;

import java.util.Scanner;
import java.util.Arrays;

public class MultipleST {

	public MultipleST() {
		// TODO Auto-generated constructor stub
	}
	
	public int[] getInput(int n) {
		int[] arr = new int[n];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter " + n + " values : ");
		
		for(int i=0; i<n; i++) {
			arr[i] = input.nextInt();
		}
		return arr;
	}
	
	
	public int getGCD(int n1, int n2) {
		int gcd, rem;
		while(n1 % n2 != 0) {
			rem = n1%n2;
			
			n1 = n2;
			n2 = rem;
		}
		gcd = n2;
		return gcd;
	}
	
	public int getLCM(int n1, int n2) {
		int lcm = (n1*n2)/getGCD(n1,n2);
		return lcm;
	}
	
	
	public void getValue(int numbers[]) {
		Arrays.sort(numbers);
		
		int N = numbers.length;
		MultipleST obj = new MultipleST();
		
		int gcd = 0;
		for(int i=N-1; i>0; i--) {
			gcd = obj.getGCD(numbers[i], numbers[i-1]);
		}
		System.out.println("The GCD of the numbers are : " + gcd);
		
		int lcm = 0;
		for(int i=N-1; i>0; i--) {
			lcm = obj.getLCM(numbers[i], numbers[i-1]);
		}
		System.out.println("The LCM of the numbers are : " + lcm);
	}
	

	public static void main(String[] args) {
		MultipleST obj = new MultipleST();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of integers : ");
		int N = input.nextInt();
				
		int numbers[] = obj.getInput(N);	
		
		obj.getValue(numbers);
	}

}
