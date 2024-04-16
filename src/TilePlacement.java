public class TilePlacement {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int vertically = placeTiles(n - m, m);//placing vertically
        int horizontally = placeTiles(n - 1, m);//placing horizontally
        return vertically + horizontally;
    }

    public static void main(String[] args) {
        System.out.println("Ways to place tiles in 4x2 floor:"+placeTiles(4, 2));
    }
}
