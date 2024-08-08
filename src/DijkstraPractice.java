import java.util.*;

public class DijkstraPractice {
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

    static class Pair{
        int node;
        int wt;

        public Pair(int node, int wt) {
            this.node = node;
            this.wt = wt;
        }
    }

    static String[] places= {"San Fransisco","Los Angeles", "Denver","Dallas","Chicago","New York","Boston"};

    public static void createGraph(List<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 3));
        graph[0].add(new Edge(0, 2, 4));
        graph[0].add(new Edge(0, 4, 5));
        graph[1].add(new Edge(1, 0, 3));
        graph[1].add(new Edge(1, 3, 5));
        graph[1].add(new Edge(1, 4, 7));
        graph[2].add(new Edge(2, 0, 4));
        graph[2].add(new Edge(2, 3, 4));
        graph[2].add(new Edge(2, 4, 6));
        graph[3].add(new Edge(3, 1, 5));
        graph[3].add(new Edge(3, 2, 4));
        graph[3].add(new Edge(3, 4, 5));
        graph[3].add(new Edge(3, 5, 6));
        graph[4].add(new Edge(4, 0, 5));
        graph[4].add(new Edge(4, 1, 7));
        graph[4].add(new Edge(4, 2, 6));
        graph[4].add(new Edge(4, 3, 5));
        graph[4].add(new Edge(4, 5, 4));
        graph[4].add(new Edge(4, 6, 3));
        graph[5].add(new Edge(5, 3, 6));
        graph[5].add(new Edge(5, 4, 4));
        graph[5].add(new Edge(5, 6, 2));
        graph[6].add(new Edge(6, 5, 2));
        graph[6].add(new Edge(6, 4, 3));
    }

    public static void dijkstra(List<Edge>[] graph, int src){
        int[] dist= new int[graph.length];
        int[] prev = new int[graph.length];
        Arrays.fill(prev, -1);
        Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.wt));
        pq.add(new Pair(src, 0));
        dist[src]=0;
        while(!pq.isEmpty()){
            int node= pq.peek().node;
            int dist1= pq.peek().wt;
            pq.poll();

            for(Edge e: graph[node]){
                int adjNode= e.dest;
                int dist2=e.wt;
                if(dist1 + dist2 < dist[adjNode]){
                    prev[adjNode]=node;
                    dist[adjNode]=dist1+dist2;
                    pq.add(new Pair(adjNode, dist[adjNode]));
                }
            }
        }

        for(int i=0;i<dist.length;i++){
            if(i==src) continue;
            System.out.print(places[src] + " --> " + places[i] + " Distance: "+ dist[i] + " | Path: ");
            printPath(prev, prev[i]);
            System.out.println(places[i]);

        }
    }

    public static void printPath(int[] prev, int node) {
        if(node==-1) return;
        printPath(prev, prev[node]);
        System.out.print(places[node]+ "-->");
    }

    public static void main(String[] args) {
        List<Edge>[] graph= new ArrayList[7];
        createGraph(graph);
        dijkstra(graph,0);
    }
}
