package module14;

import java.util.*;

public class GraphDemo {

    int V;
    LinkedList<Integer>[] adj;

    GraphDemo(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    // BFS
    void BFS(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int n : adj[node]) {
                if (!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }

    // DFS
    void DFS(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int n : adj[v]) {
            if (!visited[n])
                DFS(n, visited);
        }
    }

    // Count Components
    int countComponents() {
        boolean[] visited = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFS(i, visited);
                count++;
            }
        }
        return count;
    }

    // Shortest Path (BFS)
    void shortestPath(int start) {
        int[] dist = new int[V];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        dist[start] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int n : adj[node]) {
                if (dist[n] == -1) {
                    dist[n] = dist[node] + 1;
                    q.add(n);
                }
            }
        }

        System.out.println("Distances: " + Arrays.toString(dist));
    }

    // Print neighbors
    void printNeighbors(int v) {
        for (int n : adj[v])
            System.out.print(n + " ");
    }

    // Count vertices & edges
    void count() {
        int edges = 0;
        for (int i = 0; i < V; i++)
            edges += adj[i].size();

        System.out.println("Vertices: " + V);
        System.out.println("Edges: " + edges / 2);
    }

    public static void main(String[] args) {
        GraphDemo g = new GraphDemo(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        System.out.print("BFS: ");
        g.BFS(0);

        System.out.print("\nDFS: ");
        boolean[] visited = new boolean[5];
        g.DFS(0, visited);

        System.out.println("\nConnected Components: " + g.countComponents());

        g.shortestPath(0);

        System.out.print("Neighbors of 0: ");
        g.printNeighbors(0);

        g.count();
    }
}