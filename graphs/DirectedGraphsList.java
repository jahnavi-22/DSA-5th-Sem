package graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DirectedGraphsList {
	 ArrayList<ArrayList<Integer>> adjacencyList;

	public DirectedGraphsList(int nodes) {
		this.adjacencyList = new ArrayList<ArrayList<Integer>>(nodes);
		for(int i=0; i<nodes; i++) {
			adjacencyList.add(new ArrayList<Integer>());
		}
	}
	
	public void addEdge(int source, int destination) {
		this.adjacencyList.get(source).add(destination);
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
	
	//BFS
			public ArrayList<Integer> bfs(int n, ArrayList<ArrayList<Integer>> adj){
				ArrayList < Integer > bfs = new ArrayList<>();
				boolean vis[] = new boolean[n];
				Queue<Integer> queue = new LinkedList<Integer>();
				queue.add(0);
				
				vis[0] = true;
				while(!queue.isEmpty()) {
					Integer node = queue.poll();
					bfs.add(node);
					
					for(int i: adj.get(node)) {
						if(vis[i] == false) {
							vis[i] = true;
							queue.add(i);
						}
					}
				}
				return bfs;
			}
			
		//DFS
			public void dfs(int v, boolean[] visited) {
				visited[v] = true;
				Iterator<Integer> i = adjacencyList.get(v).listIterator();
				while(i.hasNext()) {
					int n = i.next();
					if(!visited[n])
						dfs(n, visited);
				}
			}
			
			

	public static void main(String[] args) {
		int nodes = 6;
		DirectedGraphsList obj = new DirectedGraphsList(nodes);
		
		obj.addEdge(0, 1);
		obj.addEdge(1, 3);
		obj.addEdge(3, 5);
		obj.addEdge(1, 2);
		obj.addEdge(3, 4);
		obj.addEdge(2, 4);
		
		obj.showList();
	}

}
