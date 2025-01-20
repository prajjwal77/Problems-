package Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFSTraversal {
	//Vertices
		private static int V;
		private static LinkedList<Integer> adj[];
		
		@SuppressWarnings("unchecked") public BFSTraversal(int v) {
			V = v;
			adj = new LinkedList[v];
			for(int i=0 ; i<v ; ++i) {
				adj[i] = new LinkedList<>();
			}
		}
		
		public  void addEdge(int v, int u) {
			adj[v].add(u);
		}
		public static void bfsTraversal(int s) {
			boolean[] visited = new boolean[V];
			LinkedList<Integer> queue = new LinkedList<>();
			visited[s]= true;
			queue.add(s);
			
			while(queue.size()!= 0) {
				s = queue.poll();
				System.out.print(s+" ");
				Iterator<Integer> itr = adj[s].listIterator();
				while(itr.hasNext()) {
					int n = itr.next();
					if(!visited[n]) {
						visited[n] = true;
						queue.add(n);
					}
				}
			}
			
		}
		public static void main(String[] args) {
			int v = 4;
			BFSTraversal bfs = new BFSTraversal(v);
			bfs.addEdge(0, 1);
			bfs.addEdge(0, 2);
			bfs.addEdge(1, 2);
			bfs.addEdge(2, 0);
			bfs.addEdge(3, 3);
			bfs.addEdge(3, 2);
			System.out.print("Dfs from vertex 0 : ");
			bfs.bfsTraversal(0);
			System.out.println();
			
			System.out.print("Dfs from vertex 1 : ");
			bfs.bfsTraversal(1);
			System.out.println();
			
			System.out.print("Dfs from vertex 2 : ");
			bfs.bfsTraversal(2);
		}
}
