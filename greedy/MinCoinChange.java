package greedy;

import java.util.Arrays;

import recursion.MinimumCoinsChange;

public class MinCoinChange {

	public MinCoinChange() {
		// TODO Auto-generated constructor stub
	}
	
	public static int minCoins(int denominations[], int amount) {
		int size = denominations.length;
		
		Arrays.sort(denominations); 		//ascending order
		int count = 0;
		
		//keep checking and substracting order
		for(int i = size-1; i >= 0; i--) {
			while(amount >= denominations[i]) {
				System.out.print(denominations[i] + " ");
				amount -= denominations[i];
				count++;
			}
		}
		System.out.println();
		return count;
	}

	public static void main(String[] args) {
		int denominations[] = {1, 2, 5, 10, 20, 25, 50, 100};
		int amount = 87;
		int minCoins = minCoins(denominations, amount);
		System.out.println(minCoins);
	}

}
