package factorisation;

import java.util.Scanner;

public class Factors {
	private int number;

	public Factors() {
		// TODO Auto-generated constructor stub
	}

	public void getPrimeFactors(int number) {
		System.out.print("Prime factors of " + number + " are :");
		for(int divisor = 2; divisor <= number; divisor++) {
			while(number % divisor ==0) {
				number/=divisor;
				
				if(number!=1) {
					System.out.print(divisor + " x ");
				}
				else {
					System.out.println(divisor);
				}
			}
		}
	}
	
	public int getGCD(int n1, int n2) {
		int gcd, rem;
		while(n1%n2 != 0) {
			rem = n1% n2;
			
			n1 = n2;
			n2 = rem;
		}
		gcd = n2;
		return gcd;
	}
	
	public int getLCM(int n1, int n2) {
		int lcm = (n1*n2)/getGCD(n1, n2);
		return lcm;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		Factors obj = new Factors();
		obj.getPrimeFactors(number);
		
		System.out.print("Enter two numbers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + obj.getGCD(n1,n2));
		System.out.println("The LCM of " + n1 + " and " + n2 + " is: " + obj.getLCM(n1,n2));
	}
}
