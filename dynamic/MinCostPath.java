package dynamic;

import java.util.Iterator;

public class MinCostPath {
	private int cost[][];

	public MinCostPath() {
		// TODO Auto-generated constructor stub
	}
	
	
	//with recursion - greedy approach
	public int minCost(int m, int n) {
		if(m==0 && n==0) return cost[m][n];
		else if (m<0 || n<0) return Integer.MAX_VALUE;
		return cost[m][n] + Math.min(minCost(m-1, n), minCost(m, n-1));
	}
	
	
	//with memoisation
	public int minCostM(int m, int n, int dp[][]) {
		if(m==0 && n==0) return cost[m][n];
		else if (m<0 || n<0) return Integer.MAX_VALUE;
		
		if(dp[m][n]!=-1) return dp[m][n];
		dp[m][n] = cost[m][n] + Math.min(minCostM(m-1, n, dp), minCostM(m, n-1, dp));
		return dp[m][n];
	}
	
	//with tabulation
	public int minCostT(int m, int n, int dp[][]) {
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				dp[i][j] = cost[i][j];
				
				if(i==0 && j>0) dp[i][j] += dp[i][j-1];
				else if (i>0 && j==0) dp[i][j] += dp[i-1][j];
				else if (i>0 && j>0) dp[i][j] += Math.min(dp[i-1][j], dp[i][j-1]);
			}
		}
		return dp[m-1][n-1];  
	}
	
	
	//NUMBER OF WAYS TO COVER A DISTANCE / MIN PATH STAIRS
	public static int countPath(int distance) {
		if(distance<0)
			return 0;
		if(distance==0)
			return 1;
		
		return countPath(distance-1) + countPath(distance-2) + countPath(distance-3);
	}
	
	//LONGEST COMMON SUBSEQUENCE
	public static int longestCommonSubsequence(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		
		int dp[][] = new int[m+1][n+1];
		for(int i=1; i<m+1; i++) {
			for(int j=1; j<n+1; j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] +1;
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[m][n];
	}
	
	
	public static void main(String[] args) {
		MinCostPath obj = new MinCostPath();
		
	}

}
