import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PrimsAlgo {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }

//    static class Pair implements Comparable<Pair> {
//        int node;
//        int wt;
//
//        public Pair(int v, int wt) {
//            this.node = v;
//            this.wt = wt;
//        }
//
//        public int compareTo(Pair a) {
//            return this.wt - a.wt;
//        }
//    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    public static void primAlgo(ArrayList<Edge>[] graph,ArrayList<Edge> res) {
        boolean[] vis = new boolean[graph.length];
        @SuppressWarnings("unchecked")
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.wt));
        for (int i = 0; i < graph[0].size(); i++) {
            pq.add(graph[0].get(i));
        }
        vis[0] = true;
        int cost=0;
        while (!pq.isEmpty()) {
            Edge e = pq.remove();
            if (!vis[e.dest]) {
                vis[e.dest] = true;
                cost += e.wt;
                res.add(e);

                for (int i = 0; i < graph[e.dest].size(); i++) {
                    Edge e1= graph[e.dest].get(i);
                    if (!vis[e1.dest]) {
                        pq.add(e1);
                    }
                }
            }
        }
        System.out.println(cost);

    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[4];
        createGraph(graph);
        ArrayList<Edge> res = new ArrayList<>();
        primAlgo(graph, res);
        for (Edge e : res) {
            System.out.println(e.src + " -> " + e.dest + " wt- " + e.wt);
        }
    }
}
