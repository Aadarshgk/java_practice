public class TowerofHanoi {
    public static void ToH(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Move a ring from tower " + a + " to tower " + c);
            return;
        }
        ToH(n - 1, a, c, b);
        ToH(1,a,b,c);
        ToH(n - 1, b, a, c);
    }

    public static void main(String[] args) {
        ToH(3, 'a', 'b', 'c');
    }
}
