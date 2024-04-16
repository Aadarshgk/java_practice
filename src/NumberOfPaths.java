public class NumberOfPaths {
    public static int countPaths(int i, int j, int n, int m) {
        //condition to end recursion,i.e, i or j moving out of boundary
        if (i == n || j == m) {
            return 0;
        }

        //condition when reached the required block
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // moving down
        int down= countPaths(i + 1, j, n, m);
        //moving right
        int right=countPaths(i, j + 1, n, m);
        return down+right;
    }

    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println("The number of paths for 3x3 is: " + countPaths(0, 0, 3, 3));
    }
}
