package recursion;

public class TowerOfHanoi {

	public TowerOfHanoi() {
		// TODO Auto-generated constructor stub
	}
	
	public void towerOfHanoi(int n, char source, char auxiliary, char destination) {
		if(n==1) {
			System.out.println("Moved disk " + n + " from ROD " + source + " to ROD " + destination);
			return;
		}
		
		towerOfHanoi(n-1, source, destination,  auxiliary);
		System.out.println("Moving disk " + n + " from ROD " + source + " to ROD " + destination);
		towerOfHanoi(n-1, auxiliary, source, destination);
	}

	public static void main(String[] args) {
		int n = 3;
		
		TowerOfHanoi obj = new TowerOfHanoi();
		
		obj.towerOfHanoi(n, 'A', 'B', 'C');	   	//source, auxiliary, destination

	}

}
