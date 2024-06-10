import java.util.*;

public class Graph {
        private static Stack<Integer> stack = new Stack<>();
        private static Queue<Integer> q = new LinkedList<>();
        private static HashSet<Integer> set = new HashSet<>();
        private static ArrayList<Integer> res = new ArrayList<>();
    public static ArrayList<Integer> bfsOfGraph(List<List<Integer>> adjList){
        set.clear();
        q.clear();
        res.clear();

        for(int i=1;i<adjList.size();i++){
            if(!set.contains(i)){
                q.add(i);
                set.add(i);
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
        stack.push(node);
    }


    public static void topologicalSort(List<List<Integer>> adjList) {
        set.clear();
        stack.clear();

        for (int i = 1; i < adjList.size(); i++) {
            if (!set.contains(i)) {
                dfs(i, adjList);
            }
        }

        System.out.println("Topological sorting order:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+ " ");
        }
        System.out.println();
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
        System.out.println("DFS Traversal: ");
        for(Integer a: res){
            System.out.print(a +" ");
        }
        System.out.println();

        set.clear();
        res.clear();
        topologicalSort(adjList);

    }
}
