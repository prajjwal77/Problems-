package Graph;

import java.util.Iterator;
import java.util.LinkedList;


public class CheckForCycle {
	private int V;
	// Array of lists for
	// Adjacency List Representation
	private LinkedList<Integer> adj[];
	// Constructor
	@SuppressWarnings("unchecked")
	CheckForCycle(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList<>();
	}
	public  void addEdge(int v, int u) {
		adj[v].add(u);
		adj[u].add(v);
	}
	
	public boolean isCyclicUtil(int v, boolean[] visited, int parent) {
		visited[v] = true;
		Integer i;
		
		Iterator<Integer> itr = adj[v].iterator();
		while(itr.hasNext()) {
			i = itr.next();
			if(!visited[v]) {
				if(isCyclicUtil(i, visited, v)) {
					return true;
				}
			}
			else if(i != parent) {
			 	return true;
			}
		}
		return false;
	}
	
	public boolean isCyclic(int v) {
		boolean[] visited = new boolean[v];
		for(int i=0 ; i<v ; i++) {
			visited[v] = false;
		}
		for(int i=0 ; i<v ; i++) {
			if(!visited[i]) {
				if(isCyclicUtil(i, visited, -1)) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int v1 = 5;
		CheckForCycle g1 = new CheckForCycle(v1);
		g1.addEdge(1, 0);
		g1.addEdge(0, 2);
		g1.addEdge(2, 1);
		g1.addEdge(0, 3);
		g1.addEdge(3, 4);
		
		if(g1.isCyclic(v1)) {
			System.out.println("Graph contain cycle.");
		} else {
			System.out.println("Graph does not contain cycle.");
		}
	}
}
