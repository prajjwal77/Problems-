package Graph;

import java.security.PublicKey;
import java.util.ArrayList;

class Graphh {
	ArrayList<ArrayList<Integer>> adj;
	int V;

	Graphh(int v) {
		V = v;
		adj = new ArrayList<ArrayList<Integer>>(V);
		for (int i = 0; i < V; i++) {
			adj.add(new ArrayList<Integer>());
		}

	}

	public void addEdge(int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	// without recursion
	public void printAdjacencyList() {
		for (int i = 0; i < adj.size(); i++) {
			System.out.println("Adjacency list of " + i);
			for (int j = 0; j < adj.get(i).size(); j++) {
				System.out.print(adj.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

	// using recursion
	ArrayList<Integer> ans = new ArrayList<>();

	public ArrayList<Integer> dfsGraph(int V, ArrayList<ArrayList<Integer>> adj) {
		boolean[] visited = new boolean[V];
		dfs(0, visited, adj);
		return ans;
	}

	public void dfs(int s, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
		visited[s] = true;
		ans.add(s);
		for (int i = 0; i < adj.get(s).size(); i++) {
			// adj.get(s) -> connection list
			int x = adj.get(s).get(i);
			// adj.get(s).get(i) -> connection list element

			if (visited[x] == false) {
				dfs(x, visited, adj);
			}
		}
	}
}

public class Test {
	public static void main(String[] args) {
		// Creating a graph with 5 vertices
		int V = 5;

		Graphh g = new Graphh(V);

		// Adding edges one by one.
		g.addEdge(0, 1);
		g.addEdge(0, 4);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.printAdjacencyList();
		ArrayList<Integer> dfsResult = g.dfsGraph(V, g.adj); // Corrected this line

		System.out.println("DFS Traversal: " + dfsResult); // Print the result of the DFS
	}
}
