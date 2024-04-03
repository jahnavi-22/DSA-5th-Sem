package graphs;

public class DirectedGraphsMatrix {
	private int[][] adjacencyMatrix;
	 
	public DirectedGraphsMatrix(int nodes) {
		this.adjacencyMatrix = new int[nodes][nodes];
	}
	
	public void addEdge(int source, int destination, int weight) {
		this.adjacencyMatrix[source][destination] = weight;
	}
	
	public void showMatrix() {
		for(int i=0; i<adjacencyMatrix.length; i++) {
			for(int j=0; j<adjacencyMatrix.length; j++) {
				System.out.print(adjacencyMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int nodes = 6;
		DirectedGraphsMatrix obj = new DirectedGraphsMatrix(nodes);
		
		obj.addEdge(0, 1, 0);
		obj.addEdge(1, 3, 5);
		obj.addEdge(3, 5, 5);
		obj.addEdge(1, 2, 5);
		obj.addEdge(3, 4, 5);
		obj.addEdge(2, 4, 5);
		
		obj.showMatrix();
	}

}
