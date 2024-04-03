package graphs;

import java.util.ArrayList;

public class UndirectedGraphsList {
	 ArrayList<ArrayList<Integer>> adjacencyList;

	public UndirectedGraphsList(int nodes) {
		this.adjacencyList = new ArrayList<ArrayList<Integer>>(nodes);
		for(int i=0; i<nodes; i++) {
			adjacencyList.add(new ArrayList<Integer>());
		}
	}
	
	public void addEdge(int source, int destination) {
		this.adjacencyList.get(source).add(destination);
		this.adjacencyList.get(destination).add(source);
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
		UndirectedGraphsList obj = new UndirectedGraphsList(nodes);
		
		obj.addEdge(0, 1);
		obj.addEdge(1, 3);
		obj.addEdge(3, 5);
		obj.addEdge(1, 2);
		obj.addEdge(3, 4);
		obj.addEdge(2, 4);
		
		obj.showList();
	}

}
