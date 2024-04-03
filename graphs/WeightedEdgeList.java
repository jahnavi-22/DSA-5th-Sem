package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class WeightedEdgeList {
	 ArrayList<ArrayList<GraphNode>> adjacencyList;
	 
	 static class GraphNode {
	        int destination;
	        int weight;

	        GraphNode(int destination, int weight) {
	            this.destination = destination;
	            this.weight = weight;
	        }
	    }

		public WeightedEdgeList(int nodes) {
			this.adjacencyList = new ArrayList<ArrayList<GraphNode>>(nodes);
			for(int i=0; i<nodes; i++) {
				adjacencyList.add(new ArrayList<GraphNode>());
			}
		}
		
		public void addEdge(int source, int destination, int weight) {
			this.adjacencyList.get(source).add(new GraphNode(destination, weight));
		}
		
		public void showList() {
			for(int i=0; i<adjacencyList.size(); ++i) {
				System.out.print(i);
				
				for(int j=0; j<adjacencyList.get(i).size(); j++) {
					System.out.print(" -> " + adjacencyList.get(i).get(j));
				}
				System.out.println();
			}
		}    
		
		
		

	public static void main(String[] args) {
		int nodes = 6;
		WeightedEdgeList obj = new WeightedEdgeList(nodes);
		
		obj.addEdge(0, 1, 5);
		obj.addEdge(1, 3, 2);
		obj.addEdge(3, 5, 6);
		obj.addEdge(1, 2, 4);
		obj.addEdge(3, 4, 1);
		obj.addEdge(2, 4, 3);
		
		obj.showList();

	}

}
