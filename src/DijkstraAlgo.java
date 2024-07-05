import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DijkstraAlgo {

    public static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static class Pair {
        int node;
        int wt;

        public Pair(int node, int wt) {
            this.node = node;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

    }

    public static void dijkstra(ArrayList<Edge>[] graph,int src) {

        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.wt));
        int[] dist = new int[graph.length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        pq.add(new Pair(src, 0));
        while (!pq.isEmpty()) {
            int node = pq.peek().node;
            int d = pq.peek().wt;
            pq.remove();
            for (int i = 0; i < graph[node].size(); i++) {
                int weight = graph[node].get(i).wt;
                int adjNode = graph[node].get(i).dest;
                if (d + weight < dist[adjNode]) {
                    dist[adjNode] = d + weight;
                    pq.add(new Pair(adjNode, dist[adjNode]));
                }
            }
        }

        for (int i = 0; i < graph.length; i++) {
            if(i==src) continue;
            System.out.println(src + " -> " + i + " = " + dist[i]);
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[6];
        createGraph(graph);
        dijkstra(graph, 0);
    }
}
