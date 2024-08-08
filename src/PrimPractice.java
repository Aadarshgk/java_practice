import java.util.*;

public class PrimPractice {
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

    public static void createGraph(List<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));
        graph[1].add(new Edge(1, 0, 5));
        graph[0].add(new Edge(0, 2, 2));
        graph[2].add(new Edge(2, 1, 2));
        graph[2].add(new Edge(2, 0, 2));
        graph[1].add(new Edge(1, 2, 2));
        graph[0].add(new Edge(0, 3, 6));
        graph[3].add(new Edge(3, 0, 6));
        graph[0].add(new Edge(0, 4, 4));
        graph[4].add(new Edge(4, 0, 4));
        graph[2].add(new Edge(2, 4, 3));
        graph[4].add(new Edge(4, 2, 3));
        graph[3].add(new Edge(3, 4, 3));
        graph[4].add(new Edge(4, 3, 3));
        graph[4].add(new Edge(4, 5, 8));
        graph[5].add(new Edge(5, 4, 8));
        graph[3].add(new Edge(3, 5, 7));
        graph[5].add(new Edge(5, 3, 7));
    }

    static List<Edge> res= new ArrayList<>();
    public static void primsAlgo(List<Edge>[] graph, int src){
        boolean[] vis = new boolean[graph.length];
        Arrays.fill(vis,false);
        PriorityQueue<Edge> pq= new PriorityQueue<>(Comparator.comparingInt(e-> e.wt));
        for(Edge e: graph[src]){
            pq.add(e);
        }
        vis[src]=true;
        int cost=0;
        while(!pq.isEmpty()){
            Edge e= pq.remove();
            if(!vis[e.dest]){
                vis[e.dest]=true;
                cost+=e.wt;
                res.add(e);
                for(Edge neighbour: graph[e.dest]){
                    if(!vis[neighbour.dest]){
                        pq.add(neighbour);
                    }
                }
            }
        }
        System.out.println("The total minimum cost of graph: "+ cost);

    }
    public static void main(String[] args) {
        List<Edge>[] graph= new ArrayList[7];
        createGraph(graph);
        primsAlgo(graph,5);
        for (Edge e : res) {
            System.out.println((char)(65+e.src) + " --> " + (char)(65 + e.dest) + " : weight: " + e.wt);
        }
    }
}
