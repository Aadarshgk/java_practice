import java.util.Scanner;

public class Patter14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 0; i <a / 2; i++) {
            for (int j = 1; j <= a / 2 - i -1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <a / 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*(a/2-i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
