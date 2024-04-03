package advancedArrayProblems;

public class PrimeSieveAlgo {
	private int N;
	private boolean[] arr;

	public PrimeSieveAlgo() {
		// TODO Auto-generated constructor stub
	}
	
	public void PrimeSieveFactors() {
		arr = new boolean[N];
		
		//first set all values in an array as true
		for(int i=0; i<N; i++) {
			arr[i] = true;
		}
		
		//loop till square root of N
		for(int i=2; i<Math.sqrt(N); i++) {
			if(arr[i] == true) {
				
				//keep checking the multiples and mark them false or cut them all
				for(int j=(i*i); j<N; j=j+1) {
					arr[j] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		PrimeSieveAlgo obj = new PrimeSieveAlgo();
		obj.PrimeSieveFactors();

	}

}
