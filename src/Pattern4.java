import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = a; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
