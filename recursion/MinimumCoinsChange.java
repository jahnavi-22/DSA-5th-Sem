package recursion;

public class MinimumCoinsChange {

	public MinimumCoinsChange() {
		// TODO Auto-generated constructor stub
	}
	
	public static int minCoins(int[] coins, int n, int amount) {
		if(amount == 0){
			return 0;
			}
		int res = Integer.MAX_VALUE;
		for (int i=0; i<n; i++){
			if (coins[i] <= amount){
				int sub_res = minCoins(coins, n, amount-coins[i]);
				if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
					res = sub_res + 1;
				}
			}
		return res;
		}

	public static void main(String[] args) {
		int coins[] = {11, 5, 2};
		int amount = 3;
		
		int minCoinsNeeded = minCoins(coins, 3, amount);
		System.out.println("Minimum coins needed to am");

	}

}
