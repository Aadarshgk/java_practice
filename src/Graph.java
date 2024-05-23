import java.util.*;

public class Graph {
        private static Queue<Integer> q = new LinkedList<>();
        private static HashSet<Integer> set = new HashSet<>();
        private static ArrayList<Integer> res = new ArrayList<>();
    public static ArrayList<Integer> bfsOfGraph(List<List<Integer>> adjList){
        set.clear();
        q.clear();
        res.clear();

        q.add(1);
        while(!q.isEmpty()){
            Integer a=q.remove();
            res.add(a);
            for(Integer b: adjList.get(a)){
                if(!set.contains(b)){
                    set.add(b);
                    q.add(b);
                }
            }
        }
        return res;
    }

    public static void dfs(Integer node, List<List<Integer>> adjList){
        res.add(node);
        set.add(node);
        for(Integer a: adjList.get(node)){
            if(!set.contains(a)){
                dfs(a,adjList);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<=6;i++){
            adjList.add(new ArrayList<>());
        }

        adjList.get(1).add(2);
        adjList.get(1).add(3);
        adjList.get(2).add(4);
        adjList.get(3).add(4);
        adjList.get(2).add(5);
        adjList.get(3).add(6);
        adjList.get(4).add(5);
        adjList.get(4).add(6);

        System.out.println("The adjacency list of the graph:");
        for(int i=1;i<=6;i++){
            System.out.print(i + " --> ");
            for(Integer w: adjList.get(i)){
                System.out.print(w+"  ");
            }
            System.out.println();
        }
        System.out.println("BFS Traversal: ");
        ArrayList<Integer> res = bfsOfGraph(adjList);
        for(Integer a: res){
            System.out.print(a + " ");
        }
        System.out.println();

        res.clear();
        set.clear();

        dfs(1,adjList);
        for(Integer a: res){
            System.out.print(a +" ");
        }
        System.out.println();
    }
}
