package Graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class KruskalAlgorithm {
    static class Edge {
        int src, dest, weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    static class Subset {
        int parent, rank;

        public Subset(int parent, int rank) {
            this.parent = parent;
            this.rank = rank;
        }
    }

    public static int find(Subset[] subsets, int i) {
        if (subsets[i].parent != i) {
            subsets[i].parent = find(subsets, subsets[i].parent); // Path compression
        }
        return subsets[i].parent;
    }

    public static void union(Subset[] subsets, int x, int y) {
        int rootX = find(subsets, x);
        int rootY = find(subsets, y);

        if (subsets[rootX].rank < subsets[rootY].rank) {
            subsets[rootX].parent = rootY;
        } else if (subsets[rootX].rank > subsets[rootY].rank) {
            subsets[rootY].parent = rootX;
        } else {
            subsets[rootY].parent = rootX;
            subsets[rootX].rank++;
        }
    }

    public static void kruskal(int v, List<Edge> edges) {
        List<Edge> result = new ArrayList<>(); // Store the resultant MST
        Subset[] subsets = new Subset[v];
        
        for (int i = 0; i < v; i++) {
            subsets[i] = new Subset(i, 0);
        }
        
        int e = 0, i = 0; // e: edges in MST, i: current edge index
        while (e < v - 1 && i < edges.size()) {
            Edge nextEdge = edges.get(i++);
            
            int x = find(subsets, nextEdge.src);
            int y = find(subsets, nextEdge.dest);
            
            if (x != y) {
                result.add(nextEdge);
                union(subsets, x, y);
                e++;
            }
        }
        
        System.out.println("Minimum Spanning Tree:");
        for (Edge edge : result) {
            System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
        }
    }

    public static void main(String[] args) {
        int V = 4;
        List<Edge> graphEdges = new ArrayList<>();
        graphEdges.add(new Edge(0, 1, 10));
        graphEdges.add(new Edge(0, 2, 6));
        graphEdges.add(new Edge(0, 3, 5));
        graphEdges.add(new Edge(1, 3, 15));
        graphEdges.add(new Edge(2, 3, 4));
        
        graphEdges.sort(Comparator.comparingInt(e -> e.weight));

        kruskal(V, graphEdges);
    }
}
