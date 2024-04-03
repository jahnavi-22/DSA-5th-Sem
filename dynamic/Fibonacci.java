package dynamic;

public class Fibonacci {
	private int n;

	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}
	
	public int fibRecursive(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return fibRecursive(n-1) + fibRecursive(n-2);
	}

	public static void main(String[] args) {
		int n = 48;
		Fibonacci obj = new Fibonacci();
		System.out.print("For " + n + " : ");
		System.out.println(obj.fibRecursive(n));
	}
}
