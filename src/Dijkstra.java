import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {
    static class Edge{
        int src;
        int dest;
        int wt;


        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static class Pair implements Comparable<Pair> {
        int node;
        int wt;

        public Pair(int node, int wt) {
            this.node = node;
            this.wt = wt;
        }

        @Override
        public int compareTo(Pair o) {
            return this.wt - o.wt;
        }
    }

    public static int[] dijkstra(ArrayList<Edge>[] graph, int src) {
        PriorityQueue<Pair> q = new PriorityQueue<>();
        int[] weight = new int[graph.length];
        boolean[] vis = new boolean[graph.length];
        for (int i = 0; i < weight.length; i++) {
            if (i != src) {
                weight[i] = Integer.MAX_VALUE;
            }
        }
        q.add(new Pair(src, 0));
        while (!q.isEmpty()) {
            Pair cur = q.remove();
            if (!vis[cur.node]) {
                vis[cur.node] = true;
                for (int i = 0; i < graph[cur.node].size(); i++) {
                    Edge e = graph[cur.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if (!vis[v] && weight[u] + e.wt < weight[v]) {
                        weight[v] = weight[u] + e.wt;
                        q.add(new Pair(v, weight[v]));
                    }
                }
            }
        }

        return weight;
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

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[6];
        createGraph(graph);
        int[] dist = dijkstra(graph, 0);
        for (int i = 0; i < dist.length; i++) {
            System.out.println("0 -> " + i + " : "+ (dist[i]));
        }
    }
}
