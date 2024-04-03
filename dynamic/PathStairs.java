package dynamic;

public class PathStairs {

	public PathStairs() {
		// TODO Auto-generated constructor stub
	}
	
	public int doCountPath(int n) {
		//base case
		if(n==0)
			return 1;
		else if(n<0)
			return 0;
		
		
		//rule
		int pattern_01 = doCountPath(n-1);			//for using step: 1
		int pattern_02 = doCountPath(n-2);			//for using step: 2
		int pattern_03 = doCountPath(n-3);			//for using step: 3
		
		//tp = x+y+z
		int totalPaths = pattern_01 + pattern_02 + pattern_03;
		return totalPaths;
	}
	
	public int doCountPathM(int n, int[] memo) {
		//base case
		if(n==0)
			return 1;
		else if(n<0)
			return 0;
		
		if(memo[n]>0)
			return memo[n];
		
		//rule
		int pattern_01 = doCountPathM(n-1, memo);			//for using step: 1
		int pattern_02 = doCountPathM(n-2, memo);			//for using step: 2
		int pattern_03 = doCountPathM(n-3, memo);			//for using step: 3
				
		int totalPaths = pattern_01 + pattern_02 + pattern_03;
		memo[n] = totalPaths;
		return totalPaths;
		
	}
	
	
	//tabulation
	public int doCountPathT(int n) {
		int[] table = new int[n+1];
		table[0] = 1;
		for(int i=1; i<=n; i++) {
			if(i==1) {
				table[i] = table[i-1];
			}else if(i==2) {
				table[i] = table[i-1] + table[i-2];
			}else {
				table[i] = table[i-1] + table[i-2] + table[i-3];
			}
		}
		
		for(int i=0; i<=n; i++) {
			System.out.println(table[i] + " ");
		}
		
		return table[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
